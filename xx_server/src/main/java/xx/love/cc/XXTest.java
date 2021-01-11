package xx.love.cc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 测试
 *
 * @author xhy
 * @date 2020/10/15 22:44
 */
public class XXTest {

    public static List<Integer> list = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) {
        for (int i = 0; i <= 100000; i++) {
            list.add(i);
        }

        Thread a = new Thread(new ThreadA());
        Thread b = new Thread(new ThreadB());
        Thread c = new Thread(new ThreadC());

        a.start();
        b.start();
        c.start();
    }


}

class ThreadA implements Runnable {

    @Override
    public void run() {
        List<Integer> tempList = XXTest.list.stream().filter(i -> i > 10000).collect(Collectors.toList());
        for (int i : tempList) {
            i++;
//            System.out.println(i++);
        }
    }
}

class ThreadB implements Runnable {
    @Override
    public void run() {
        while (XXTest.list.size() > 0) {
            XXTest.list.remove(0);
            System.out.println(XXTest.list.size());
        }
    }
}

class ThreadC implements Runnable {
    @Override
    public void run() {
        while (XXTest.list.size() < 1000000) {
            XXTest.list.add(100);
            System.out.println(XXTest.list.size());
        }
    }
}