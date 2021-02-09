package xx.love.cc.msg;

/**
 * GameMessage
 *
 * @author xhy
 * @date 2021/2/9 17:49
 */
public class GameMessage implements IMessage {
    /**
     * 消息编码（消息号）
     */
    protected int code;

    /**
     * 消息体
     */
    protected byte[] bytes;

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public byte[] getBytes() {
        return bytes;
    }

    @Override
    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }
}
