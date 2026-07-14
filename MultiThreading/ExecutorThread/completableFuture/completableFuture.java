package MultiThreading.ExecutorThread.completableFuture;

import java.util.concurrent.CompletableFuture;

public class completableFuture {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(()->{
            System.out.println("Running...supplyAsync");
            return 10;
        }).thenApply(x->x*2).thenAccept(System.out::println);

       CompletableFuture<Void>f2= CompletableFuture.runAsync(()->{
           System.out.println("Running...runAsync");
       });
        CompletableFuture.supplyAsync(() -> 100)
                .thenRun(() -> System.out.println("Completed"))
                .join();
    }
}
