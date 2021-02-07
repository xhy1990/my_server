package xx.love.cc.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import org.slf4j.Logger;
import xx.love.cc.appConfig.ConfigMgr;
import xx.love.cc.netty.codec.GameDecoder;
import xx.love.cc.netty.codec.GameEncoder;
import xx.love.cc.util.LoggerUtil;

/**
 * netty管理
 *
 * @author xhy
 * @date 2021/2/7 16:03
 */
public class NettyMgr {
    private static final Logger log = LoggerUtil.getNettyLogger();
    private static ServerBootstrap serverBootstrap;

    public static boolean init() {
        try {
            initNetty();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        log.info("netty初始化完成！");
        log.info("serverId: {}, port: {}", ConfigMgr.serverConfig.getServerId(), ConfigMgr.serverConfig.getPort());
        return true;
    }

    public static void initNetty() {
        EventLoopGroup bossGroup = new NioEventLoopGroup(1);
        //默认参数的线程数会是系统最大可用cpu*2
        EventLoopGroup workGroup = new NioEventLoopGroup();
        try {
            // server 启动引导
            serverBootstrap = new ServerBootstrap();
            // 配置启动的参数
            serverBootstrap.group(bossGroup, workGroup)
                    // 设置非阻塞IO,用它来建立新accept的连接,用于构造ServerSocketChannel的工厂类
                    .channel(NioServerSocketChannel.class)
                    // 临时存放已完成三次握手的请求的队列的最大长度，如果大于队列的最大长度，请求会被拒绝
                    // 默认值window是200其他系统是128。
                    .option(ChannelOption.SO_BACKLOG, 1024)
                    .childOption(ChannelOption.SO_RCVBUF, 65536)
                    .childOption(ChannelOption.SO_SNDBUF, 65536)
                    .childOption(ChannelOption.TCP_NODELAY, true)
                    .childOption(ChannelOption.SO_KEEPALIVE, true)
                    .handler(new LoggingHandler(LogLevel.INFO))
                    .childHandler(new ChannelInitializer<NioSocketChannel>() {
                        @Override
                        protected void initChannel(NioSocketChannel ch) {
                            ch.pipeline()
                                    .addLast(new LengthFieldBasedFrameDecoder(Integer.MAX_VALUE, 0, Integer.BYTES, 0, Integer.BYTES))
                                    .addLast(new GameDecoder())
                                    .addLast(new LengthFieldPrepender(Integer.BYTES))
                                    .addLast(new GameEncoder());
                        }
                    });
            ChannelFuture serverChannelFuture = serverBootstrap.bind(ConfigMgr.serverConfig.getPort()).sync();
            serverChannelFuture.channel().closeFuture().addListener(ChannelFutureListener.CLOSE);
        } catch (Exception e) {
            log.error("netty启动失败", e);
        }
    }


    public static ServerBootstrap getServerBootstrap() {
        return serverBootstrap;
    }
}
