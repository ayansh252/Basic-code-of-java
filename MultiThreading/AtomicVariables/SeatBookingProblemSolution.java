package MultiThreading.AtomicVariables;

import java.util.concurrent.atomic.AtomicReference;

public class SeatBookingProblemSolution {
    public static void main(String[] args) {
        SeatBookingSolution sb=new SeatBookingSolution();
        Thread t1=new Thread(()->{
            System.out.println( sb.bookSeat("Aditya"));
        });
        Thread t2=new Thread(()->{
            System.out.println(sb.bookSeat("Ayansh"));
        });
        t1.start();
        t2.start();
    }
}
class SeatBookingSolution{
    AtomicReference<String>seat=new AtomicReference<>("Empty");
    boolean bookSeat(String name){
        String currVal=seat.get();
        if(!currVal.equals("Empty")){
            return false;
        }
        return seat.compareAndSet("Empty",name);
    }
}
