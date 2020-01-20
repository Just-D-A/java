package domain.queue;

import domain.customer.Customer;

public interface Queue{
    void addNew(Customer customer);
    boolean isEmpty();
    Customer next();
}
