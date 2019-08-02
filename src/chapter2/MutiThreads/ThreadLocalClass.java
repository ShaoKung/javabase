package chapter2.MutiThreads;

/**
 * @program: javabase
 * @description: 线程副本概念及理解
 * @author: Andy
 * @create: 2019-08-02 16:37
 **/

public class ThreadLocalClass {

    public static ThreadLocal<Integer> seqNum=new ThreadLocal<Integer>(){
        public Integer initialValue(){
            return 0;
        }
    };
    public ThreadLocal<Integer> getThreadLocal(){
        return seqNum;
    }

    public int getNextNum(){
        seqNum.set(seqNum.get()+1);
        return seqNum.get();
    }

    private static class TestClient extends Thread{
        private ThreadLocalClass sn ;
        public TestClient(ThreadLocalClass sn){
           this.sn=sn;
        }
        public void run(){
            for(int i=0;i<3;i++){
                System.out.println("thread["+Thread.currentThread().getName()+"]-->sn["+sn.getNextNum()+"]");
            }
            sn.getThreadLocal().remove();
        }

    }

    public static void main(String[] args) {
        ThreadLocalClass sn=new ThreadLocalClass();
        TestClient t1=new TestClient(sn);
        TestClient t2=new TestClient(sn);
        TestClient t3=new TestClient(sn);
        t1.start();
        t2.start();
        t3.start();
    }

}
