package dev.bozlak;

public class Customer {
    private long customerId;
    private String customerName;

    public Customer(long customerId, String customerName) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    public Customer() {
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

}
