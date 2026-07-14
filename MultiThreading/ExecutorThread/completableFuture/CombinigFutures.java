package MultiThreading.ExecutorThread.completableFuture;

import java.util.concurrent.CompletableFuture;

public class CombinigFutures {
    public static void main(String[] args) {
        CompletableFuture<Integer> f1=CompletableFuture.supplyAsync(()->10);
        CompletableFuture<Integer> f2=CompletableFuture.supplyAsync(()->20);
        CompletableFuture<Void> result=f1.thenCombine(f2,(a,b)->a+b)
                .thenAccept(System.out::println);
    }
}
