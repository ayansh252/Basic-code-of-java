package MultiThreading.ExecutorThread.OverLoadsOfFuture;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class SubmitRunnableWithResult {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        Future<String> f1=executor.submit(()->{
            System.out.println("Hello World");
            try{
                Thread.sleep(3000);
            }catch (InterruptedException e){}
        },"SUCCESS");
        f1.cancel(true);
        System.out.println(f1.isCancelled() );
        try{
            System.out.println(f1.isDone());
            System.out.println(f1.get(2, TimeUnit.SECONDS));
        }catch (Exception e){}
        executor.shutdown();
    }
}
