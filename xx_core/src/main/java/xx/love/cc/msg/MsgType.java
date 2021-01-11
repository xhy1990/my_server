package xx.love.cc.msg;

/**
 * 消息类型
 *
 * @author xhy
 * @date 2020/9/19 21:49
 */
public enum MsgType {
    DEFAULT(0),
    GM(1);

    public final int type;

    private MsgType(int type) {
        this.type = type;
    }


}
