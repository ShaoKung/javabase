package chapter3.ThreadSafty;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: javabase
 * @description: 显示锁reentrantlock实例
 * @author: Andy
 * @create: 2019-08-13 21:58
 **/

public class ReentrantLockDemo {
    public static void main(String[] args) {
        final Count ct = new Count();
        for (int i = 0; i < 2; i++) {
            new Thread() {
                @Override
                public void run() {
                    ct.get();
                }
            }.start();
        }

        for (int i = 0; i < 2; i++) {
            new Thread() {
                @Override
                public void run() {
                    ct.put();
                }
            }.start();
        }
    }
}

class Count {
    final ReentrantLock lock = new ReentrantLock();
    public void get() {

        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + "get begin");
            Thread.sleep(1000L);
            System.out.println(Thread.currentThread().getName() + "get end");
            lock.unlock();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void put() {
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + "put begin");
            Thread.sleep(1000L);
            System.out.println(Thread.currentThread().getName() + "put end");
            lock.unlock();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


