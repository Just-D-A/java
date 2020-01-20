package interactor;

import domain.basket.Basket;
import domain.cashDesk.CashDesk;
import domain.customer.Customer;
import domain.product.Product;
import domain.queue.Queue;
import domain.storage.Storage;
import domain.supermarket.Supermarket;

public class CustomerInteractor{
    public static void enterTheSupermarket(Customer customer, Supermarket supermarket) {
        customer.enterTheMarket(supermarket);
        System.out.println("Customer " + customer.getName() + " has entered the supermarket");
    }

    public static void putProductToBasket(Customer customer, Product product) {
        if (product != null) {
            Supermarket supermarket = customer.getMarket();
            Storage storage = supermarket.getStorage();
            Basket basket = customer.getBasket();

            basket.addProductInBasket(product);
            System.out.println("Put product to " + customer.getName() + "'s basket " + product.getName());
            storage.deleteProduct(product);
        }
    }

    public static void enterQueue(Customer customer, CashDesk cashDesk) {
        Queue queue = cashDesk.getQueue();
        queue.addNew(customer);
        System.out.println("Customer " + customer.getName() + " enter the cash desk queue");
    }

    public static void payAmount(Customer customer, double amount) {
        System.out.println(customer.getName() + " pays " + amount + " RUB");
        exitTheSupermarket(customer);
    }

    public static void exitTheSupermarket(Customer customer) {
        customer.leaveTheMarket();
        System.out.println("Customer " + customer.getName() + " exit the supermarket");
    }

}
