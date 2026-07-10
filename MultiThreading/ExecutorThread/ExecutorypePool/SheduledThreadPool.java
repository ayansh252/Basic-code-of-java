package MultiThreading.ExecutorThread.ExecutorypePool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SheduledThreadPool {
    public static void main(String[] args) {
        ScheduledExecutorService sheduler= Executors.newScheduledThreadPool(1);
//       for(int i=1;i<=5;i++){
//           sheduler.schedule(()->{
//               System.out.println(Thread.currentThread().getName());
//           },2, TimeUnit.SECONDS);
//       }
        sheduler.scheduleAtFixedRate(() -> {

            System.out.println(
                    "Running : " +
                            System.currentTimeMillis());

        }, 2, 3, TimeUnit.SECONDS);
      sheduler.shutdown();
    }

}
