package chapter2.MutiThreads;

/**
 * @program: javabase
 * @description: 线程组的概念及理解
 * @author: Andy
 * @create: 2019-08-02 16:33
 **/

public class ThreadGroup {
    public static void main(String[] args) {
        //获取当前线程
        Thread current=Thread.currentThread();
        //获取当前线程组
        System.out.println("线程组"+current.getThreadGroup());
    }
}
