package xx.love.cc;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;
import org.slf4j.Logger;
import xx.love.cc.appConfig.ConfigMgr;
import xx.love.cc.msg.MsgMgr;
import xx.love.cc.netty.NettyMgr;
import xx.love.cc.util.LoggerUtil;

/**
 * 启动入口
 *
 * @author xhy
 * @date 2020/9/18 16:51
 */
public class AppServer {

    private static final Logger log = LoggerUtil.getAppServerLogger();

    public static AppServer appServer;
    public static String configPath;

    public void start() {
        long startTime = System.currentTimeMillis();
        log.debug("server开始启动……");
        boolean success = init();
        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
        if (success) {
            log.info("server启动成功！耗时：{}ms", time);
        } else {
            log.info("server启动失败！耗时：{}ms", time);
        }

    }

    private boolean init() {
        log.info("初始化ing……");
        //初始化配置文件
        if (!ConfigMgr.init()) {
            return false;
        }
        if (!MsgMgr.init()) {
            return false;
        }
        if (!NettyMgr.init()) {
            return false;
        }
        log.info("初始化完成！");
        return true;
    }


    public static void main(String[] args) {
        //添加启动参数，这样就可以任意指定配置文件地址
        configPath = args[0];
        //设置默认的异常处理,可以捕获其他线程中抛出的异常
        Thread.setDefaultUncaughtExceptionHandler((t, e) ->
                log.error("exception happened in thread |" + t.getName() + "|" + e.getMessage(), e));
        //加载log配置，初始化log系统
        LoggerContext loggerContext = (LoggerContext) LogManager.getContext(false);
        loggerContext.setConfigLocation(new File(configPath + "\\log4j2.xml").toURI());
        //启动服务器
        appServer = new AppServer();
        appServer.start();
    }

}
