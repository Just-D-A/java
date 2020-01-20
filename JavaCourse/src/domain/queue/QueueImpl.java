package domain.queue;

import domain.customer.Customer;

import java.util.ArrayList;

public class QueueImpl implements Queue{
    private final ArrayList<Customer> customers;

    public QueueImpl() {
        customers = new ArrayList<>();
    }

    @Override
    public void addNew(Customer customer) {
        customers.add(customer);
    }

    @Override
    public boolean isEmpty() {
        return customers.isEmpty();
    }

    @Override
    public Customer next() {
        return customers.remove(0);
    }
}
