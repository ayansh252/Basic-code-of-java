package MultiThreading.Locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock2 {
    public static void main(String[] args) {
        Resource1 r1=new Resource1();
        Thread t1=new Thread(()->{
            try{
                r1.f1();
            }catch (InterruptedException e){}
        });
        Thread t2=new Thread(()->{
            try{
                r1.f1();
            }catch (InterruptedException e){}
        });
        t1.start();
        t2.start();
    }
}
class Resource1{
    Lock lock=new ReentrantLock();
    void f1() throws InterruptedException {
    boolean isLock=   lock.tryLock(2, TimeUnit.SECONDS);
    if(isLock){
            System.out.println(Thread.currentThread().getName()+"entered");
            lock.unlock();
        }else{
            System.out.println("lock is not acquired by thread");
        }
    }
}
