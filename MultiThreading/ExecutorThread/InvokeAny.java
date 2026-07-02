package MultiThreading.ExecutorThread;
import java.util.List;
import java.util.concurrent.*;
public class InvokeAny {
        public static void main(String[] args) throws Exception {
            ExecutorService executor = Executors.newFixedThreadPool(3);
            List<Callable<Integer>> tasks = List.of(
                    () -> {
                        Thread.sleep(3000);
                        return 10;
                    },
                    () -> {
                        Thread.sleep(1000);
                        return 20;
                    },
                    () -> {
                        Thread.sleep(2000);
                        return 30;
                    }
            );

            Integer result = executor.invokeAny(tasks);

            System.out.println(result);

            executor.shutdown();
        }
}
