package xx.love.cc.netty.handler;

import com.google.protobuf.MessageLite;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import xx.love.cc.message.base.BaseProtobufMessage;

/**
 * server
 *
 * @author xhy
 * @date 2021/2/9 10:51
 */
public class ServerHandler extends SimpleChannelInboundHandler<MessageLite> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MessageLite msg) throws Exception {
        System.out.println("Server Greeting: " + ((BaseProtobufMessage) msg).getContent());
        ctx.writeAndFlush(msg);
    }
}
