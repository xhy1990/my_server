package xx.love.cc;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import xx.love.cc.msg.IMessage;

/**
 * client
 *
 * @author xhy
 * @date 2021/2/9 10:52
 */
public class ClientHandler extends SimpleChannelInboundHandler<IMessage> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, IMessage msg) throws Exception {
        System.out.println("Client Greeting: " + msg.getCode());
    }
}
