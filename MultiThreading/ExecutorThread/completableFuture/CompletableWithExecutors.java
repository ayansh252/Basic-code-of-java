package MultiThreading.ExecutorThread.completableFuture;

import java.util.concurrent.*;

public class CompletableWithExecutors {
    public static void main(String[] args) {
        ExecutorService executorService = new ThreadPoolExecutor(2,5,20,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(3));
       CompletableFuture.runAsync(()->{
                       for(int i=1;i<=10;i++){
                           int taskId=i;
                           executorService.execute(()->{
                               System.out.println("Task "+taskId +" is performed by"+Thread.currentThread().getName());
                           });
                    }

                },executorService).join();
        executorService.shutdown();
    }
}
