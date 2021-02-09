package xx.love.cc.netty.codec;

import java.util.List;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import xx.love.cc.msg.IMessage;

import static io.netty.buffer.Unpooled.wrappedBuffer;

/**
 * 编码器
 *
 * @author xhy
 * @date 2021/2/7 18:25
 */
public class MyEncoder extends MessageToMessageEncoder<IMessage> {

    @Override
    protected void encode(ChannelHandlerContext ctx, IMessage msg, List<Object> out) throws Exception {
        //先获取消息对应的枚举编号
//        int messageId = msg.getCode();
        int code = msg.getCode();
        byte[] bytes = msg.getBytes();
//        System.out.println("1:" + bytes.length);
        out.add(code);
        out.add(wrappedBuffer(bytes));
    }
}
