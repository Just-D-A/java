package app.factory;

import domain.basket.Basket;
import domain.basket.BasketImpl;

public class BasketFactory {
    public static Basket createSimpleBasket() {
        return new BasketImpl();
    }
}