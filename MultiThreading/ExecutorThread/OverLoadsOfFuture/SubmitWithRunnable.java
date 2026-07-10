package MultiThreading.ExecutorThread.OverLoadsOfFuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SubmitWithRunnable {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newCachedThreadPool();
        Future<?> f1=executor.submit(()->{
            System.out.println("Hello World");
            return "goodbye";
        });
        try{
            System.out.println(f1.get());
        }catch (InterruptedException | ExecutionException e){}
        executor.shutdown();
    }
}

