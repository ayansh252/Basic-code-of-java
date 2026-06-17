package MultiThreading.Synchronized;

public class CustomLock {
    public static void main(String[] args) {
        Bank bank=new Bank();
        Thread t1=new Thread(bank::deposit);
        Thread t2=new Thread(bank::withDraw);
        Thread t3=new Thread(bank::m1);
        Thread t4=new Thread(bank::m1);
        Thread t5=new Thread(bank::deposit);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
class Bank{
    final Object lock1=new Object();
    final Object lock2=new Object();
    void m1(){
        synchronized (new Object()){
            System.out.println(Thread.currentThread().getName()+ " Entered m1");
            try{
                Thread.sleep(2000);
            }catch (Exception e){}
            System.out.println(Thread.currentThread().getName()+" exited m1");
        }
    }
    void deposit(){
        synchronized (lock1){
            System.out.println("Money deposited succesfully");
            try{
                Thread.sleep(2000);
            }catch (Exception e){}
        }
    }
    void withDraw(){
        synchronized (lock2){
            System.out.println("money debited from your account");
            try{
                Thread.sleep(2000);
            }catch (Exception e){}
        }
    }
}
