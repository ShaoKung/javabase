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

}
