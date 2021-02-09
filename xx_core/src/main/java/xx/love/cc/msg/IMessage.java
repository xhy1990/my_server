package xx.love.cc.msg;

/**
 * 服务器消息接口
 *
 * @author xhy
 * @date 2021/2/8 15:04
 */
public interface IMessage {
    public static final int HEAD = 4;


    /**
     * 消息号
     *
     * @return
     */
    public int getCode();

    public void setCode(int code);

    /**
     * 消息体
     *
     * @return
     */
    public byte[] getBytes();

    public void setBytes(byte[] bytes);

}
