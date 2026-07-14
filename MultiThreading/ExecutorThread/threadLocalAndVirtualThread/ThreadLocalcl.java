package MultiThreading.ExecutorThread.threadLocalAndVirtualThread;

public class ThreadLocalcl {
    public static void main(String[] args) {
        ThreadLocal<String>name=new ThreadLocal<>();
        Thread t1=new Thread(()->{
            name.set("Ayansh");
            System.out.println(name.get());
        });
        Thread t2=new Thread(()->{
            name.set("Aditya");
            System.out.println(name.get());
        });
        t1.start();
        t2.start();
    }
}
