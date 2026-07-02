package MultiThreading.ExecutorThread;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.*;

public class InvokeAll {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        List<Callable<Object>> task=List.of(()->10,
                                     ()->20,
                                     ()->"hello",
                                     ()->40,
                                     ()->"world");
       try {
           List<Future<Object>> f=executorService.invokeAll(task);
          for(int i=0;i<f.size();i++){
              System.out.println(f.get(i).get());
          }
       }catch (InterruptedException e){} catch (ExecutionException e) {
           throw new RuntimeException(e);
       }
        executorService.shutdown();
    }
}
