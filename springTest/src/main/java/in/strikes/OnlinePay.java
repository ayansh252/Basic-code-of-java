package in.strikes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class OnlinePay implements PaymentService {

    @Override
    public void pay(){
        System.out.println("OnlinePay");
    }
}
