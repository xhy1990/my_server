package xx.love.cc.msg;

/**
 * 消息管理类
 *
 * @author xhy
 * @date 2020/9/19 22:18
 */
public class MsgMgr {

    public static boolean init() {
        try {
            initMsg();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static void initMsg() {

    }

}
