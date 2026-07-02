package MultiThreading.ExecutorThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureAndCallable {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        Future<Integer>f=executorService.submit(()->10);
        try{
            System.out.println(f.get());
        }catch (ExecutionException | InterruptedException e){

        }
        executorService.shutdown();
    }
}
