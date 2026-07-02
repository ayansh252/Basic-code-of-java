package MultiThreading.ExecutorThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExecuteException {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        try{
            executorService.execute(()->{
                int x=10/0;
            });
        }catch (Exception e){
            System.out.println("catch execute exception");
        }
        executorService.shutdown();
    }
}
