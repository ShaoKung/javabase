package chapter2.MutiThreads;

import java.util.concurrent.Callable;

public class ImplCallable implements Callable {
    @Override
    public Object call() throws Exception {
        Thread.sleep(1000);
        System.out.println("This is call thread");
        return null;
    }
}
