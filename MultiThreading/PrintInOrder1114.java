
package MultiThreading;

public class PrintInOrder1114 {

    int state = 1;

    public synchronized void printFirst(Runnable printFirst)
            throws InterruptedException {

        while (state != 1) {
            wait();
        }

        printFirst.run();
        state = 2;
        notifyAll();
    }

    public synchronized void printSecond(Runnable printSecond)
            throws InterruptedException {

        while (state != 2) {
            wait();
        }

        printSecond.run();
        state = 3;
        notifyAll();
    }

    public synchronized void printThird(Runnable printThird)
            throws InterruptedException {

        while (state != 3) {
            wait();
        }

        printThird.run();
        state = 4;
        notifyAll();
    }

    public static void main(String[] args) {

        PrintInOrder1114 obj = new PrintInOrder1114();

        Thread t1 = new Thread(() -> {
            try {
                obj.printFirst(() -> System.out.print("first"));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                obj.printSecond(() -> System.out.print("second"));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread t3 = new Thread(() -> {
            try {
                obj.printThird(() -> System.out.print("third"));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        t3.start();
        t2.start();
        t1.start();
    }
}
