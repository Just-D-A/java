package domain.customer;

import domain.basket.Basket;
import domain.product.Product;
import domain.supermarket.Supermarket;

import java.util.ArrayList;

public class CustomerImpl implements Customer{
    private final String name;
    private final boolean isChild;
    private Supermarket supermarket;
    private final Basket basket;


    public CustomerImpl(String name, boolean isChild, Basket basket) {
        this.name = name;
        this.isChild = isChild;
        this.basket = basket;
    }


    @Override
    public void enterTheMarket(Supermarket supermarket) {
        this.supermarket = supermarket;
    }

    public void leaveTheMarket() {
        this.supermarket = null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean getIsChild() {
        return isChild;
    }

    @Override
    public Basket getBasket() {
        return basket;
    }

    @Override
    public Supermarket getMarket() {
        return supermarket;
    }

    @Override
    public void addProduct(Product product) {
        basket.addProductInBasket(product);
    }

}

