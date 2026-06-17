package MultiThreading.Problems;

public class VisibilityProblem {
    volatile static boolean flag=false;
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){}
            flag=true;
        });
        Thread t2=new Thread(()->{
            while (!flag){
//            basicallly or Sytem.out.printLn()method is synychornized
//            mean if we use it in it often read flag value from ram it did not read value from t2 cache
            }
            System.out.println("Thread 2 is finished");
        });
        t1.start();
        t2.start();
    }
}
