package MultiThreading.Synchronized;

public class SynchronizedObject {
    public static void main(String[] args) {
        Test1 test =new Test1();
        Thread t1=new Thread(()->test.m1());
        Thread t2=new Thread(()->test.m2());
        t1.start();
        t2.start();
    }
}
class Test1{

    synchronized  void m1(){
        System.out.println("m1 entered");
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){}
        System.out.println("m1 exit");
    }
    synchronized void m2(){
        System.out.println("m2 entered");
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){}
        System.out.println("m2 exit");
    }
}
