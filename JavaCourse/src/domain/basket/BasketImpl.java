package domain.basket;

import domain.product.Product;
//import domain.storage.StorageImpl;

import java.util.ArrayList;

public class BasketImpl implements Basket{
    private final ArrayList<Product> productsInBasket;

    public BasketImpl() {
        productsInBasket = new ArrayList<>();
    }

    @Override
    public void addProductInBasket(Product product) {
        productsInBasket.add(product);
    }

    @Override
    public void deleteProductFromBasket(Product product) {
        productsInBasket.remove(product);
    }

   /* @Override
    public double getBasketCost() {
        double sum = 0;
        for(Product product: productsInBasket) {
            sum += product.getCost();
        }
        return sum;
    }*/

    @Override
    public void clearBasket() {
        productsInBasket.clear();
    }

    @Override
    public ArrayList<Product> getProductList() {
        return productsInBasket;
    }
}
