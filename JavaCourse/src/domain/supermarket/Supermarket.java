package domain.supermarket;

import domain.cashDesk.CashDesk;
import domain.customer.Customer;
import domain.discount.discountprocess.DiscountProcess;
import domain.storage.Storage;

public interface Supermarket {
    void open();
    Storage getStorage();
    CashDesk getCashDesk();
    DiscountProcess getDiscountProcess();
    /*void addCustomer(Customer customer);
    void removeCustomer(Customer customer);
    Customer findCustomer(String findName);
    void getInfo();*/
    void close();
    /*CashDesk getCashDeskByNumber(int number);
    Warehouse getWarehouse();
    DiscountManager getDiscountManager();
    Accountant getAccountant();*/
}
