package domain.supermarket;

import app.factory.CashDeskFactory;
import domain.cashDesk.CashDesk;
import domain.customer.Customer;
import domain.discount.discountprocess.DiscountProcess;
import domain.storage.Storage;

import java.util.ArrayList;

public class SupermarketImpl implements Supermarket {
    private boolean isOpen;
    private final Storage storage;
    private final CashDesk cashDesk;
    private final DiscountProcess discountProcess;

    public SupermarketImpl(Storage storage, DiscountProcess discountProcess, CashDesk cashDesk) {
        this.storage = storage;
        this.discountProcess = discountProcess;
        this.cashDesk = cashDesk;
        isOpen = false;

    }

    @Override
    public void open() {
        isOpen = true;
        System.out.println("Supermarket is open");
    }


    @Override
    public Storage getStorage() {
        return storage;
    }

    @Override
    public CashDesk getCashDesk() {
        return cashDesk;
    }

    @Override
    public DiscountProcess getDiscountProcess() {
        return discountProcess;
    }

   /* @Override
    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println(customer.getName() + " enter to market");
    }

    @Override
    public void removeCustomer(Customer customer) {
        customers.remove(customer);
        System.out.println(customer.getName() + " exit to market");
    }

    @Override
    public Customer findCustomer(String findName) {
        for(Customer marketCustomer: customers) {
            if( marketCustomer.getName().equals(findName)) {
                return marketCustomer;
            }
        }
        System.out.println("Customer not finded");
        return null;
    }*/

  /*  @Override
    public void getInfo() {
        System.out.println("Customers in market:");
        for(Customer customer: customers) {
            System.out.println(customer.getName() + " sum in bascket: " + customer.getProductsCost());
        }
        System.out.println("Products in market:");
        storage.getInfo();
    }
*/
    @Override
    public void close() {
        isOpen = false;
        System.out.println("Supermarket is close");
    }
}
