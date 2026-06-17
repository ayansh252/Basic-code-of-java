package MultiThreading;

public class Interrupt {
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            while (!Thread.currentThread().isInterrupted()){
                System.out.println("Running...");
            }
        });

        try{
            t1.start();
            System.out.println(Thread.currentThread().isInterrupted());
          Thread.sleep(2000);

            t1.interrupt();
        }catch (Exception e){}

    }
}
