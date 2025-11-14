package dev.bozlak;

public class PostgreSqlCustomerDal implements CustomerDal {
    @Override
    public boolean add(Customer customer) {
        System.out.println("Added PostgreSql Database : " + customer.getCustomerName() + " named");
        return true;
    }
}
