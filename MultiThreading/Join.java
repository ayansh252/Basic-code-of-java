package MultiThreading;

public class Join {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Name of Thread :"+Thread.currentThread().getName());
        Thread t1=new Thread(()->{
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println("Thread name : " +Thread.currentThread().getName());
        });
        t1.start();
        t1.join(100);
        System.out.println("main thread ends");
    }
}
