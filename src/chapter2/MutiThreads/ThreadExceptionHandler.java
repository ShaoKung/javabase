package chapter2.MutiThreads;

/**
 * @program: javabase
 * @description: 线程异常处理
 * @author: Andy
 * @create: 2019-08-02 16:59
 **/

public class ThreadExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("An exception has been captured ");
        System.out.printf("Thread: %s\n",t.getId());
        System.out.printf("Exception:%s:%s\n",e.getClass().getName(),e.getMessage());
        System.out.printf("Stack Trace:\n");
        e.printStackTrace(System.out);
        System.out.printf("Thread status:%s\n",t.getState());
    }
}
