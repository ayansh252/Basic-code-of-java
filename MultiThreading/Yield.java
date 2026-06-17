package MultiThreading;

public class Yield {
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            for(int i=1;i<=10;i++){
                System.out.println("T1 : " +i);
                Thread.yield();
            }
        });
        Thread t2=new Thread(()->{
            for(int i=1;i<=10;i++){
                System.out.println("T2 : " +i);
            }
        });
        t1.start();
        t2.start();
    }
}
