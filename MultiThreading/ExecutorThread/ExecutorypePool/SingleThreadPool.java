package MultiThreading.ExecutorThread.ExecutorypePool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for(int i=1;i<=5;i++){
            int taskId=i;
            executorService.execute(()->{
                System.out.println("Task "+taskId+" is performed by "+Thread.currentThread().getName());
            });
        }
        executorService.shutdown();
    }

}
