package MultiThreading.Problems;

public class ProducerAndConsumer {
    public static void main(String[] args) {
        Box b1=new Box();
        Thread t1=new Thread(()->{
            for(int i=1;i<=10;i++){
                try{
                    Thread.sleep(2000);
                }catch (InterruptedException e){}
                b1.producer(i);
            }
        });
        Thread t2=new Thread(()->{
            for(int i=1;i<=10;i++){
                try{
                    Thread.sleep(1000);
                }catch  (InterruptedException e){}
                b1.consume();
            }
        });
        t1.start();
        t2.start();
    }
}
class Box{
   volatile Integer item;
    volatile boolean flag=false;

    void producer(int val){
        while (item!=null){

        }
        this.item=val;
        this.flag=true;
        System.out.println("producer produces value "+ item);
    }
    void consume(){
        while (item==null){

        }
        System.out.println("consumer consumes value " +item);
        item=null;
        flag=false;
    }
}
