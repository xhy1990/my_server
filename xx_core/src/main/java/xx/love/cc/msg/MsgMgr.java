package xx.love.cc.msg;

import java.util.HashMap;

import com.google.protobuf.MessageLite;
import xx.love.cc.message.MessageCode;
import xx.love.cc.message.base.CGTest1;
import xx.love.cc.message.base.GCTest1;
import xx.love.cc.message.hello.CGTest2;
import xx.love.cc.message.hello.GCTest2;

/**
 * 消息管理类
 *
 * @author xhy
 * @date 2020/9/19 22:18
 */
public class MsgMgr {

    private static HashMap<Integer, Class<? extends MessageLite>> messageCodeMap = new HashMap<>();

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
        messageCodeMap = new HashMap<>();
        messageCodeMap.put(MessageCode.CG_TEST_1_VALUE, CGTest1.class);
        messageCodeMap.put(MessageCode.GC_TEST_1_VALUE, GCTest1.class);
        messageCodeMap.put(MessageCode.CG_TEST_2_VALUE, CGTest2.class);
        messageCodeMap.put(MessageCode.GC_TEST_2_VALUE, GCTest2.class);
    }

    public static Class<? extends MessageLite> getMessageClass(int messageCode) {
        return messageCodeMap.get(messageCode);
    }

}
