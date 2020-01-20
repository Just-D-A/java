package domain.customer;

import domain.basket.Basket;
import domain.product.Product;
import domain.supermarket.Supermarket;

import java.util.ArrayList;

public interface Customer {
  //  double getProductsCost();
    void enterTheMarket(Supermarket supermarket);
    String getName();
    boolean getIsChild();
    Basket getBasket();
    Supermarket getMarket();
    void leaveTheMarket();

    void addProduct(Product product);
}
