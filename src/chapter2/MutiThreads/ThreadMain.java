package chapter2.MutiThreads;

import java.util.concurrent.FutureTask;

public class ThreadMain {
    public static void main(String [] args){


        //继承Thread类实现多线程,缺点是无法多继承,启动方法如下
        //ExtendsThead ext=new ExtendsThead();
        //ext.start();
        //实现runnable接口实现多线程,启动方法如下
        //ImplRunnable ir=new ImplRunnable();
        //new Thread(ir).start();
        //实现Callable接口的call方法,启动方法如下
        ImplCallable ic=new ImplCallable();
        FutureTask<String> futureTask=new FutureTask<>(ic);
        new Thread(futureTask).start();
        System.out.println("This is the main thread");
    }
}
