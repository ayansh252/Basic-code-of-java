package MultiThreading;

public class ThreadPriority {
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            System.out.println("Custom thread is running ... " +Thread.currentThread().getName());
        });
        Thread t2=new Thread(()->{
            System.out.println("cutom thread is running "+Thread.currentThread().getName());
        });
        t1.setName("worker 0");
        t2.setName("worker 1");
        t1.start();
        t2.start();
        t1.setPriority(10);
        System.out.println(t1.getPriority());
    }
}
