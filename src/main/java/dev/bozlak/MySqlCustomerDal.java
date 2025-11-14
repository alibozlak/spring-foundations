package dev.bozlak;

public class MySqlCustomerDal implements CustomerDal {
    @Override
    public boolean add(Customer customer) {
        System.out.println("Added MySql Database : " + customer.getCustomerName() + " named");
        return true;
    }
}
