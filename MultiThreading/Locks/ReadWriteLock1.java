package MultiThreading.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLock1 {
    public static void main(String[] args) {
        SharedResource sr = new SharedResource();
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
class SharedResource{
    private int value=0;
    ReadWriteLock rwLock= new ReentrantReadWriteLock();
    Lock rl=rwLock.readLock();
    Lock wl=rwLock.writeLock();
    public int read(){
            rl.lock();
        try {
            try { System.out.println(Thread.currentThread().getName() + " reading");
                Thread.sleep(2000);
                return value;
            } catch (InterruptedException e) {
            }
        }finally {
            rl.unlock();
        }
        return 0;
    }
    public void write(int newVal) {
        wl.lock();
        try {
            try {
                System.out.println(Thread.currentThread().getName() + " writing " + newVal);
                Thread.sleep(1000);
                value = newVal;
            } catch (InterruptedException e) {

            }
        } finally {
            wl.unlock();
        }
    }
}
