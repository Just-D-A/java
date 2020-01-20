package interactor;

import domain.basket.Basket;
import domain.cashDesk.CashDesk;
import domain.customer.Customer;
import domain.product.Product;
import domain.queue.Queue;

public class CashDeskInteractor{
    public static boolean isQueueEmpty(CashDesk cashDesk) {
        Queue queue = cashDesk.getQueue();
        return queue.isEmpty();
    }

    public static Customer getQueueCustomer(CashDesk cashDesk) {
        Queue queue = cashDesk.getQueue();
        return queue.next();
    }

    public static double scanProducts(CashDesk cashDesk, Customer customer) {
        cashDesk.initPurchase();
        Basket basket = customer.getBasket();
        boolean isChild = customer.getIsChild();
        for (Product product : basket.getProductList()) {

            if (((product.getIsForChild()) && isChild) || (!isChild)) {
                cashDesk.scanProduct(product);
                System.out.println("Scan product: " + product.getName());
            } else {
                System.out.println("Customer " + customer.getName() + " cannot buy adult-only product " + product.getName());
            }
        }

        basket.clearBasket();
        cashDesk.addCash();

        System.out.println("Customer " + customer.getName() + " buy products for " + cashDesk.getAmount());

        return cashDesk.getAmount();
    }
}
