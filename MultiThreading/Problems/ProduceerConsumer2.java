package MultiThreading.Problems;

public class ProduceerConsumer2 {
    public static void main(String[] args) {
  Box1 b=new Box1();
  Thread t1=new Thread(()->{
      for(int i=1;i<=10;i++){
         try{
             b.producer(i);
         }catch (InterruptedException e){}
      }
  });
  Thread t2=new Thread(()->{
      for(int i=1;i<=10;i++){
          try{
              b.consumer();
          }catch (InterruptedException e) {}
      }
  });
  t1.start();
  t2.start();
    }
}
class Box1{
  Integer item;
  boolean flag=false;

  synchronized void producer(int val) throws InterruptedException {
      while (item!=null){
          wait();
      }
      item=val;
      flag=true;
      System.out.println("producer produces "+ item);
      notify();
  }
  synchronized void consumer() throws InterruptedException{
      while (item==null){
          wait();
      }
      System.out.println("consumer consumes "+item);
      item=null;
      flag=false;
      notify();
  }
}
