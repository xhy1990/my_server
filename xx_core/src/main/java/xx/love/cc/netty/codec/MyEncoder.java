package xx.love.cc.netty.codec;

import java.util.List;

import com.google.protobuf.MessageLite;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;

import static io.netty.buffer.Unpooled.wrappedBuffer;

/**
 * 编码器
 *
 * @author xhy
 * @date 2021/2/7 18:25
 */
public class MyEncoder extends MessageToMessageEncoder<MessageLite> {

    @Override
    protected void encode(ChannelHandlerContext ctx, MessageLite msg, List<Object> out) throws Exception {
        //先获取消息对应的枚举编号
//        int messageId = msg.getCode();
        int code = 100;
        byte[] bytes = msg.toByteArray();
//        System.out.println("1:" + bytes.length);
        out.add(code);
        out.add(wrappedBuffer(bytes));
    }
}
