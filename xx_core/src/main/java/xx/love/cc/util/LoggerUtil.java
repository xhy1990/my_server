package xx.love.cc.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 日志系统工具类
 *
 * @author xhy
 * @date 2021/1/23 16:36
 */
public class LoggerUtil {

    /**
     * appServer相关日志
     */
    private static final Logger appServerLogger = LoggerFactory.getLogger("appServer");
    /**
     * 测试日志
     */
    private static final Logger testLogger = LoggerFactory.getLogger("test");
    /**
     * netty相关日志
     */
    private static final Logger nettyLogger = LoggerFactory.getLogger("netty");

    public static Logger getAppServerLogger() {
        return appServerLogger;
    }

    public static Logger getTestLogger() {
        return testLogger;
    }

    public static Logger getNettyLogger() {
        return nettyLogger;
    }
}
