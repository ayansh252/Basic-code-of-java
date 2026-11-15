package MultiThreading;

public class Synchronized1 {
    public static void main(String[] args) {
//        Test1 test1 = new Test1();
//        Thread t1=new Thread(()->{
//            test1.m1();
//        });
//        Thread t2=new Thread(()->{
//            test1.m2();
//            test1.m1();
//        });
//        t1.start();
//        t2.start();
       Bank b=new Bank();
       Thread t1=new Thread(()->{
           b.deposit();
       });
       Thread t2=new Thread(()->{b.withdraw();});
       Thread t3=new Thread(()->{b.m1();});
       Thread t4=new Thread(()->{b.m1();});
       Thread t5=new Thread(()->{b.withdraw();});

       t5.start();
       t1.start();
       t2.start();
       t3.start();
       t4.start();
    }
}
class Bank{

    final Object lock1=new Object();
    final Object lock2=new Object();

    void deposit(){
        synchronized (lock1){
            System.out.println("money get deposited");
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){}
        }
    }

    void withdraw(){
        synchronized (lock2){
            System.out.println("money get withdraw "+Thread.currentThread().getName());
            try {
                Thread.sleep(2200);
            }catch (InterruptedException e){}
        }
    }

    void m1(){
        synchronized (new Object()){
            System.out.println(Thread.currentThread().getName()+" m1 begin");
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){}
            System.out.println(Thread.currentThread().getName()+" m1 end");
        }
    }

}
class Test1{
    synchronized void m1(){
        System.out.println(Thread.currentThread().getName()+"  entered");
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"  exiting");
    }
   synchronized void m2(){
        System.out.println(Thread.currentThread().getName()+"  m2entered");
        System.out.println(Thread.currentThread().getName()+"  m2exiting");
    }
}
