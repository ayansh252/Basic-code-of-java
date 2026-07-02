package MultiThreading.ExecutorThread;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemoIntro {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        for(int i=1;i<=5;i++){
            int taskId=i;
            executorService.execute(()->{
                System.out.println("Task " + taskId+ " is performed by " +
                        Thread.currentThread().getName());
            });
        }
        executorService.shutdown();
    }
}
