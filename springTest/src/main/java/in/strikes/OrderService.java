package in.strikes;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class OrderService implements InitializingBean {
   private PaymentService paymentService;
    public OrderService(@Qualifier("CashPay") PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("OrderService afterPropertiesSet");
    }
    public  void makePayment(){
        paymentService.pay();
    }
}
