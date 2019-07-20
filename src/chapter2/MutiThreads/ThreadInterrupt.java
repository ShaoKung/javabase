package chapter2.MutiThreads;

public class ThreadInterrupt implements Runnable{
    @Override
    public void run() {
        boolean stop=false;
        while(!stop){
            System.out.println("Thread is running");
            long time=System.currentTimeMillis();
            while(System.currentTimeMillis()-time<1000){

            }
            if(Thread.currentThread().isInterrupted()){
                break;
            }
        }
        System.out.println("Thread exiting under request");
    }

    public static void main(String[] args) throws Exception{
        Thread thread=new Thread(new ThreadInterrupt(),"ThreadInterrupt Thread");
        System.out.println("Starting Thread");
        thread.start();
        Thread.sleep(3000);
        System.out.println("Interrupt Thread start");
        thread.interrupt();
        System.out.println("线程是否中断:"+thread.isInterrupted());
        Thread.sleep(3000);
        System.out.println("Stopping application");
    }
}
