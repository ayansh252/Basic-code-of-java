package MultiThreading.ExecutorThread.threadLocalAndVirtualThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorVirtualthread {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newVirtualThreadPerTaskExecutor();
        for(int i=1;i<=10;i++){
            executor.submit(()->{
                System.out.println("Task is executed by "
                        +Thread.currentThread());
            });
        }
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){

        }
        executor.shutdown();
    }
}
