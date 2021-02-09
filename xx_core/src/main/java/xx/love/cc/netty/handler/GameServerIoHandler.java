package xx.love.cc.netty.handler;

import com.google.protobuf.MessageLite;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import xx.love.cc.msg.IMessage;
import xx.love.cc.msg.MsgMgr;

/**
 * 网络消息接收器
 *
 * @author xhy
 * @date 2021/2/9 18:18
 */
public class GameServerIoHandler extends ChannelInboundHandlerAdapter {


    /**
     * 通道激活时触发，当客户端connect成功后，服务端就会接收到这个事件，从而可以把客户端的Channel记录下来，供后面复用
     *
     * @param ctx
     * @throws Exception
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {

    }

    /**
     * 当收到对方发来的数据后，就会触发，参数msg就是发来的信息，可以是基础类型，也可以是序列化的复杂对象。
     *
     * @param ctx
     * @param msg
     * @throws Exception
     */
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        IMessage message = (IMessage) msg;
        Class<MessageLite> clazz = (Class<MessageLite>) MsgMgr.getMessageClass(message.getCode());
        System.out.println("收到客户端消息，code=" + message.getCode());

        MessageLite messageLite = clazz.newInstance();
        messageLite.getParserForType().parseFrom(message.getBytes());
//        ctx.writeAndFlush(messageLite);
        ctx.writeAndFlush(message);
    }


}
