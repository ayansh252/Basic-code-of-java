package MultiThreading.Locks;

import java.util.concurrent.Semaphore;

public class Semaphore12 {
    public static void main(String[] args) {
SemaphoreResource s1=new SemaphoreResource();
Thread r1=new Thread(()->s1.read());
Thread r2=new Thread(()->s1.read());
Thread r3=new Thread(()->s1.read());
Thread r4=new Thread(()->s1.read());
Thread r5=new Thread(()->s1.read());
Thread r6=new Thread(()->s1.read());
Thread r7=new Thread(()->s1.read());
r1.start();
r2.start();
r3.start();
r4.start();
r5.start();
r6.start();
r7.start();
    }
}
class SemaphoreResource {
    private int value;
    Semaphore s1 = new Semaphore(3, true);

    public void read() {
        try {
            try {
                s1.acquire();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            ;
            System.out.println("Read lock acuire by thread " + Thread.currentThread().getName());
        } finally {
            s1.release();
        }
    }

}

