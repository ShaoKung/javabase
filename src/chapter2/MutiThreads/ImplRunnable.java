package chapter2.MutiThreads;

public class ImplRunnable implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("This is the thread two");
    }
}
