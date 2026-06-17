package MultiThreading.Synchronized;

public class SynchronizedKeyword {
    public static void main(String[] args) {
        Counter1 c = new Counter1() ;
            Thread t1 = new Thread(() -> {
                for (int i = 1; i <= 1000; i++) {
                    c.increment();
                }
            });
            Thread t2=new Thread(()->{
                for(int i=1;i<=1000;i++){
                    c.increment();
                }
            });
            t1.start();
            t2.start();
         try{
             t1.join();
             t2.join();
         }catch (InterruptedException e){}
        System.out.println(c.count);
    }
}
class Counter1{
    int count=0;
    synchronized public void increment(){
        count++;
    }
}
