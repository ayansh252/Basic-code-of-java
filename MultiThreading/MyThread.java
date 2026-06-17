package MultiThreading;

public class MyThread {
    public static void main(String[] args) {
        customThread t1=new customThread();
        t1.start();
    }
}

class customThread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is running ...");
    }
}
