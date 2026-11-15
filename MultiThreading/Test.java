package MultiThreading;

public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(
                ()->{
                    while(!Thread.currentThread().isInterrupted()){
                        System.out.println("t1 ");

                    }
                    Thread.yield();
                }
        );
        Thread t2 = new Thread(()->{
            for(int i=0;i<5;i++){
                System.out.println("t2 "+i);
            }
        });
        t1.start();

        t1.interrupt();
        t2.start();
    }
}
