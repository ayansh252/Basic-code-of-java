package MultiThreading.ExecutorThread.ThreadPoolExecutor;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorWithLinkedBlocking {
    public static void main(String[] args) {
        ThreadPoolExecutor executor=new ThreadPoolExecutor(
                2,5,10, TimeUnit.SECONDS,new LinkedBlockingDeque<>()
        );

        for(int i=1;i<=20;i++){
            int taskId=i;
            executor.execute(()->{
                System.out.println("Task "+taskId+" is performed by "+Thread.currentThread().getName());
                try{
                    Thread.sleep(2000);
                }catch (InterruptedException e){}
            });
        }
        executor.shutdown();
    }
}
