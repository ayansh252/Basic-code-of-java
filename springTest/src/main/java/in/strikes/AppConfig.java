package in.strikes;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean(/*initMethod = "start"*/)
    @Qualifier("OnlinePay")
    public PaymentService paymentService(){
        return new OnlinePay();
    }
    @Bean
    @Qualifier("CashPay")
    public PaymentService cashPay(){
        return new CashPay();
    }
}
