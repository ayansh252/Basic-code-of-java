package MultiThreading.Synchronized;

public class SynchronizedBlock {
    public static void main(String[] args) {
   Counter2 c=new Counter2();
   Thread t1=new Thread(()->{
       for(int i=0;i<1000;i++){
           c.increment();
       }
   });
   Thread t2=new Thread(()->{
       for(int i=0;i<1000;i++){
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
class Counter2{
    int count=0;
    void increment(){
        synchronized (this){
            count++;
        }
    }
}

