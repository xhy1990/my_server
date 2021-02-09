package xx.love.cc;

import com.google.protobuf.MessageLite;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import xx.love.cc.message.base.CGTest1;

/**
 * client
 *
 * @author xhy
 * @date 2021/2/9 10:52
 */
public class ClientHandler extends SimpleChannelInboundHandler<MessageLite> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MessageLite msg) throws Exception {
        System.out.println("Client Greeting: " + ((CGTest1) msg).getText());
    }
}
