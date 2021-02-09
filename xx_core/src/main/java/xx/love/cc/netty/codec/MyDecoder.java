package xx.love.cc.netty.codec;

import java.util.List;

import com.google.protobuf.MessageLite;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import xx.love.cc.msg.GameMessage;
import xx.love.cc.msg.IMessage;
import xx.love.cc.msg.MsgMgr;

/**
 * 解码器
 *
 * @author xhy
 * @date 2021/2/7 18:24
 */
public class MyDecoder extends MessageToMessageDecoder<ByteBuf> {

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf msg, List<Object> out) throws Exception {
//        System.out.println("msg.size:" + msg.readableBytes());
        int code = msg.readInt();
        Class<MessageLite> clazz = (Class<MessageLite>) MsgMgr.getMessageClass(code);
        if (clazz == null) {
            System.out.println("无效的消息号，code=" + code);
            return;
        }
        int byteLength = msg.readableBytes();
//        System.out.println("msg.length:" + msg.readableBytes());
        byte[] bytes = new byte[byteLength];
        msg.readBytes(bytes);

        IMessage message = new GameMessage();
        message.setCode(code);
        message.setBytes(bytes);
        out.add(message);
    }
}
