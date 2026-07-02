package MultiThreading.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock1 {
    public static void main(String[] args) {
        Resource r=new Resource();
        Thread t1=new Thread(()-> r.f1());
        Thread t2=new Thread(()-> r.f1());
        t1.start();
        t2.start();
    }
}
class Resource{
    Lock lock=new ReentrantLock();

    void f1(){
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName() +"entered");
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){}
            System.out.println(Thread.currentThread().getName() +"Exited");
        }finally {
            lock.unlock();
        }
    }
}
