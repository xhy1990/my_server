package xx.love.cc;

import java.io.IOException;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import xx.love.cc.message.base.CGTest1;
import xx.love.cc.msg.GameMessage;
import xx.love.cc.msg.IMessage;
import xx.love.cc.netty.codec.MyDecoder;
import xx.love.cc.netty.codec.MyEncoder;

/**
 * client
 *
 * @author xhy
 * @date 2021/2/8 20:30
 */
public class AppClient {
    public static void main(String[] args) throws InterruptedException, IOException {
        EventLoopGroup workGroup = new NioEventLoopGroup(1);
        int serverPort = 7777;
        try {
            Bootstrap bootstrap = new Bootstrap();

            bootstrap.group(workGroup)
                    .channel(NioSocketChannel.class)
                    .handler(new ChannelInitializer<NioSocketChannel>() {
                        @Override
                        protected void initChannel(NioSocketChannel ch) throws Exception {
                            ChannelPipeline pipeline = ch.pipeline();
                            pipeline.addLast(new LengthFieldBasedFrameDecoder(Integer.MAX_VALUE, 0, Integer.BYTES, 0, 0))
                                    .addLast(new MyDecoder())
                                    .addLast(new LengthFieldPrepender(Integer.BYTES))
                                    .addLast(new MyEncoder());

                            // 这里是客户端的逻辑处理器
                            pipeline.addLast(new ClientHandler());
                        }
                    });
//                    .option(ChannelOption.SO_SNDBUF, 8192)
//                    .option(ChannelOption.SO_RCVBUF, 8192)
//                    .option(ChannelOption.TCP_NODELAY, true)
//                    .option(ChannelOption.SO_KEEPALIVE, false);

            ChannelFuture future = bootstrap.connect("localhost", serverPort).sync();
            timedSendMsg(future.channel());
            future.channel().closeFuture().sync();
        } finally {
            workGroup.shutdownGracefully();
        }
    }

    /**
     * 定时发送消息
     *
     * @param channel
     */
    private static void timedSendMsg(Channel channel) {
        for (int index = 0; index < 20; index++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // ignore
            }

            // 每5次发一个请求
            if (index % 5 == 0) {
//                BaseProtobufMessage msg = BaseProtobufMessage.newBuilder().setCode(1000).setContent("hahahaa" + index).build();
                CGTest1 msg = CGTest1.newBuilder().setText("hahahaa" + index).build();
                IMessage message = new GameMessage();
                message.setCode(1001);
                message.setBytes(msg.toByteArray());
                channel.writeAndFlush(message);
                System.out.println("Client sent" + index);
            }
        }
    }
}
