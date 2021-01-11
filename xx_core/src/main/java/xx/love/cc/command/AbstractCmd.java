package xx.love.cc.command;

/**
 * 抽象命令类
 *
 * @author xhy
 * @date 2020/9/19 21:24
 */
public class AbstractCmd implements ICmd {
    @Override
    public void execute() {
        System.out.println("哈哈哈：AbstractCmd");
    }
}
