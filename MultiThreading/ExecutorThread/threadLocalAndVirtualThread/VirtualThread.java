package MultiThreading.ExecutorThread.threadLocalAndVirtualThread;

public class VirtualThread {
    public static void main(String[] args) {
        Thread t1=Thread.startVirtualThread(()->{
            System.out.println(Thread.currentThread());
        });
        try{
            t1.join();
        }catch(InterruptedException e){}
    }
}
