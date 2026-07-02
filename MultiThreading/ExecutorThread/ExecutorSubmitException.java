package MultiThreading.ExecutorThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorSubmitException {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(2);

         Future<Integer>f= executorService.submit(()-> {
                     return 10 / 0;
                 });
        try {
            System.out.println(f.get());
        } catch (Exception e) {
            System.out.println("Caught hello : " + e);
        }
        executorService.shutdown();
    }
}
