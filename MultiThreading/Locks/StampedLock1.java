package MultiThreading.Locks;

import java.util.concurrent.locks.StampedLock;

public class StampedLock1 {
    public static void main(String[] args) {
        SharedResources sr=new SharedResources();
        Thread r1 = new Thread(() -> System.out.println(sr.read()));
        Thread r2 = new Thread(() -> System.out.println(sr.read()));
        Thread r3 = new Thread(() -> System.out.println(sr.read()));

        Thread w1 = new Thread(() -> sr.write(1));
        Thread w2 = new Thread(() -> sr.write(2));
        Thread w3 = new Thread(() -> sr.write(3));

        r1.start();
        r2.start();
        r3.start();
        w1.start();
        w2.start();
        w3.start();
    }
}
class SharedResources{
    private int value;
    StampedLock lock=new StampedLock();
    public int read(){
        long stamp=lock.tryOptimisticRead();
        int currval=value;
        if(!lock.validate(stamp)){
            stamp=lock.readLock();
            try{
                currval=value;
            }finally {
                lock.unlockRead(stamp);
            }
        }
        System.out.println(Thread.currentThread().getName() +" reads value "+value);
        return currval;
    }
    public void write(int newVal){
        long stamp=lock.writeLock();
        try{
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
            value=newVal;
            System.out.println(Thread.currentThread().getName()+" changes value "+value);
        }finally {
            lock.unlockWrite(stamp);
        }
    }
}
