package MultiThreading.Synchronized;

public class SynchornizedStatic {
    public static void main(String[] args) {
        Counter3 c=new Counter3();
        Thread t1=new Thread(c::increment);
        Thread t2=new Thread(c::increment);
        t1.start();
        t2.start();
    }
}
class Counter3{
    static int count=0;
    void increment(){
        synchronized(Counter3.class){
            try{
                Thread.sleep(2000);
            }catch (Exception e){}
            count++;
            System.out.println(count);
        }
    }
}
