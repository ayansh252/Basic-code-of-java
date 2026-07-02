package MultiThreading.AtomicVariables;

public class SeatBookingProblem {
    public static void main(String[] args) {
        SeatBooking sb=new SeatBooking();
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
class SeatBooking{
    String seat=new String("Empty");
    boolean bookSeat(String person){
        if(seat.equals("Empty")){
            seat= person;
            return true;
        }else{
            return false;
        }
    }
}
