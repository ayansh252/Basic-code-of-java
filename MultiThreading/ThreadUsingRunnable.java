package MultiThreading;

public class ThreadUsingRunnable {
    public static void main(String[] args) {
      myThread run=new myThread();
      Thread t1=new Thread(run);
      t1.start();
    }
}
class myThread implements  Runnable{
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}
