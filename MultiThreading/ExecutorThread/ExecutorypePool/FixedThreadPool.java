package MultiThreading.ExecutorThread.ExecutorypePool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService= Executors
                .newFixedThreadPool(2);
        for(int i=1;i<=10;i++){
            int taskId=i;
            executorService.execute(()->{
                System.out.println("Task "+taskId+" is performed by "+Thread
                        .currentThread().getName());
                try{
                    Thread.sleep(2000);
                }catch (InterruptedException e){}
            });
        }
        executorService.shutdown();
    }
}
