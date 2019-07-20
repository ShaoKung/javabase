package chapter2.MutiThreads;


public class ExtendsThead extends Thread {
    public void run(){
        super.run();
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("This is the thread first");
    }
}
