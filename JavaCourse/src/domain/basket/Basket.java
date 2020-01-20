package domain.basket;

import domain.product.Product;

import java.util.ArrayList;

public interface Basket {
    void addProductInBasket(Product product);
    void deleteProductFromBasket(Product product);
    void clearBasket();
    ArrayList<Product> getProductList();
    //double getBasketCost();
}
