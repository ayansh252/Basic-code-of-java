package in.strikes;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CashPay implements PaymentService{
    @Override
    public void pay() {
        System.out.println("Cash on delivery");
    }
}
