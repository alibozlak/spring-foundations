package dev.bozlak;

public class FirstCustomerManager implements CustomerService {
    private final CustomerDal customerDal;

    public FirstCustomerManager(CustomerDal customerDal){
        this.customerDal = customerDal;
    }

    @Override
    public boolean add(Customer customer) {
        System.out.println("Doing operations with FirstCustomerManager");
        return this.customerDal.add(customer);
    }
}
