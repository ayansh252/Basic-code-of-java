package MultiThreading.AtomicVariables;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInteger12 {
    public static void main(String[] args) {
        Counter c=new Counter();
        Thread t1=new Thread(()->{
            for(int i=1;i<=1000;i++){
                c.increment();
            }
        });
        Thread t2=new Thread(()->{
            for(int i=1;i<=1000;i++){
                c.increment();
            }
        });
        t1.start();
        t2.start();
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){}
        System.out.println(c.count);
    }
}
class Counter{
    AtomicInteger count=new AtomicInteger(0);
    void increment(){
        count.incrementAndGet();
    }
}
