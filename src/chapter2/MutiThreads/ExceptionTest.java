package chapter2.MutiThreads;

/**
 * @program: javabase
 * @description:
 * @author: Andy
 * @create: 2019-08-09 21:54
 **/

public class ExceptionTest {
    public static void main(String[] args) {
        ExceptionMaker task=new ExceptionMaker();
        Thread test=new Thread(task);
        test.setUncaughtExceptionHandler(new ThreadExceptionHandler());
        test.start();

    }
}
