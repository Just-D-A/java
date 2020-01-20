package domain.cashDesk;

import domain.product.Product;
import domain.queue.Queue;

public interface CashDesk {
    double getCash();
    double getAmount();
    Queue getQueue();
    void initPurchase();
    void scanProduct(Product product);
    void addCash();

}
