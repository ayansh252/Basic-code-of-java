package MultiThreading;

public class CustomNAmeOFThread {
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        });
        t1.setName("Worker-0");
        t1.start();
    }
}

