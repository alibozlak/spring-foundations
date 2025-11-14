package dev.bozlak;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args ) throws Exception
    {
        //IoC - Inversion of Control
        //Dependency Injection - DI

        //Değişime direnmeyen program yazmak çok önemli!!!

        //Yazılım : İnsanların günlük hayattaki aktivitelerinin bilgisayar destekli sistemlerle kolaylaştırılması.
        //İnsanların ihtiyaçları sürekli iyileşiyor..

        //SOLID prensipleri

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(IocConfig.class);
        Customer customer = new Customer(1,"Ali Bozlak");
//        CustomerDal customerDal = context.getBean(CustomerDal.class);
//        customerDal.add(customer);
//        System.out.println("----------");

        CustomerService customerService = context.getBean(CustomerService.class);
        customerService.add(customer);
    }
}
