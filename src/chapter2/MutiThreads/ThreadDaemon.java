package chapter2.MutiThreads;

public class ThreadDaemon extends Thread{

    public void run(){
        for (int i=0;i<5;i++) {
            System.out.println("线程ThreadDaemon第"+i+"次执行");
            try {
                Thread.sleep(7);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String args[]){
        Thread td=new ThreadDaemon();
        Thread tb=new ThreadBackend();
        td.setDaemon(true);
        td.start();
        tb.start();
        Thread mainThread=Thread.currentThread();
        System.out.println("线程td是不是守护进程"+td.isDaemon());
        System.out.println("线程tb是不是守护进程"+tb.isDaemon());
        System.out.println("线程mainThread是不是守护进程"+mainThread.isDaemon());
    }

}
