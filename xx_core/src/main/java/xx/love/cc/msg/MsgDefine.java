package xx.love.cc.msg;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 消息定义注解
 *
 * @author xhy
 * @date 2020/9/19 21:41
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MsgDefine {
    //消息id
    short id();

    //消息名字
    String name();

    //消息类型
    MsgType msgType();
}
