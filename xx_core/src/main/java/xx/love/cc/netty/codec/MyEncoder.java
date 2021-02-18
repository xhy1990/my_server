package xx.love.cc.netty.codec;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import xx.love.cc.msg.IMessage;

/**
 * 编码器
 *
 * @author xhy
 * @date 2021/2/7 18:25
 */
public class MyEncoder extends MessageToByteEncoder<IMessage> {

//    @Override
//    protected void encode(ChannelHandlerContext ctx, IMessage msg, List<Object> out) throws Exception {
//        //先获取消息对应的枚举编号
////        int messageId = msg.getCode();
//        int code = msg.getCode();
//        byte[] bytes = msg.getBytes();
////        System.out.println("1:" + bytes.length);
//        out.add(ctx.alloc().buffer(4).writeInt(code));
//        out.add(wrappedBuffer(bytes));
//    }

    @Override
    protected void encode(ChannelHandlerContext ctx, IMessage msg, ByteBuf out) throws Exception {
        //先获取消息对应的枚举编号
//        int messageId = msg.getCode();
        int code = msg.getCode();
        byte[] bytes = msg.getBytes();
//        System.out.println("1:" + bytes.length);
        out.writeInt(code);
        out.writeBytes(bytes);
    }
}
