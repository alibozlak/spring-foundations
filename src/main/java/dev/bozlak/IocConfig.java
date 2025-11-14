package dev.bozlak;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IocConfig {

    @Bean
    public CustomerDal getCustomerDal(){
        return new MySqlCustomerDal();
    }

    @Bean
    public CustomerService getCustomerService(){
        return new FirstCustomerManager(this.getCustomerDal());
    }
}
