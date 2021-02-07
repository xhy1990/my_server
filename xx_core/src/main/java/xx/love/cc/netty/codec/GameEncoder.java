package xx.love.cc.netty.codec;

import java.util.List;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;

/**
 * 编码器
 *
 * @author xhy
 * @date 2021/2/7 18:25
 */
public class GameEncoder extends MessageToMessageEncoder {
    @Override
    protected void encode(ChannelHandlerContext ctx, Object msg, List out) throws Exception {

    }
}
