package chapter2.MutiThreads;

public class ImplRunnable implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread currentThread=Thread.currentThread();
        System.out.println("当前线程的名字是:"+currentThread.getName());
        System.out.println("当前线程的ID是:"+currentThread.getId());
        System.out.println("当前线程的优先级是:"+currentThread.getPriority());
        System.out.println("当前线程的状态是:"+currentThread.getState());
        System.out.println("当前线程的线程组是:"+currentThread.getThreadGroup());
        System.out.println("当前线程的默认异常处理对象是:"+currentThread.getUncaughtExceptionHandler());
        System.out.println("当前线程的堆栈信息:"+currentThread.getStackTrace());
        System.out.println("当前线程是否是活动状态:"+currentThread.isAlive());
        //中断线程
        //currentThread.interrupt();
        System.out.println("当前线程是否是已经中断:"+currentThread.isInterrupted());
        System.out.println("当前线程是否为守护线程:"+currentThread.isDaemon());
        System.out.println("This is the thread two");
    }
}
