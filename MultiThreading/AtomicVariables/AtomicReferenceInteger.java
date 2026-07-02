package MultiThreading.AtomicVariables;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceInteger {
    public static void main(String[] args) {
        Counter5 c5=new Counter5();
        Thread t1=new Thread(()->{
            for(int i=1;i<=1000;i++){
                c5.like();
            }
        });
        Thread t2=new Thread(()->{
            for(int i=1;i<=1000;i++){
                c5.like();
            }
        });
        t1.start();
        t2.start();
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){

        }
        System.out.println(c5.totalCount);
    }
}
class Counter5{
    AtomicReference<Integer>totalCount=new AtomicReference<>(0);
    public void like(){
        while (true){
            Integer currVal=totalCount.get();
            Integer finalCount=currVal+1;
            if(totalCount.compareAndSet(currVal,finalCount)){
                return;
            }else{
                System.out.println("retry conflict is detected");
            }
        }
    }
}
