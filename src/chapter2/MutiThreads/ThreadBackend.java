package chapter2.MutiThreads;

/**
 * @program: javabase
 * @description: 后台线程测试类
 * @author: Andy
 * @create: 2019-08-02 16:24
 **/

public class ThreadBackend extends Thread{
    public void run(){
        for(long i=0;i<9999999L;i++){
            System.out.println("后台线程第"+i+"次执行");
            try{
                Thread.sleep(7);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
