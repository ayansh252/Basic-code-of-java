package MultiThreading.ExecutorThread.OverLoadsOfFuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SubmitCallable {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(5);
        Future<Integer>f= executor.submit(()->{
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){}
            return 10;
        });
        try{
            System.out.println(f.get());
        }catch (ExecutionException | InterruptedException e){}
        executor.shutdown();
    }
}
