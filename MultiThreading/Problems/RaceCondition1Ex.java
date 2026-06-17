package MultiThreading.Problems;

public class RaceCondition1Ex {
    public static void main(String[] args) {
        Counter1 ct=new Counter1();
        Thread t1=new Thread(()->{
            for(int i=1;i<=1000;i++){
                ct.increment();
            }
        });
        Thread t2=new Thread(()->{
            for (int i=1;i<=1000;i++){
                ct.increment();
            }
        });
        t1.start();
        t2.start();
       try{
           t1.join();
           t2.join();
       }catch (Exception e){}
        System.out.println(ct.count);
    }
}
class Counter1{
    int count=0;
    public void increment(){
        count++;
    }
}
