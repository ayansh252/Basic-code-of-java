package MultiThreading;

public class UseThread {
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            System.out.println("Enter thread :"+Thread.currentThread().getName());
            for(int i=1;i<=10;i++){
                System.out.println("Thread t1 :" +i);
            }
            System.out.println("Exiting thread :"+ Thread.currentThread().getName());
        });
        Thread t2=new Thread(()->{
            System.out.println("Enter thread :"+Thread.currentThread().getName());
            for(int i=1;i<=10;i++){
                System.out.println("Thread t2 :" +i);
            }
            System.out.println("Exiting thread :"+ Thread.currentThread().getName());
        });
        t1.start();
        t2.start();
    }
}
