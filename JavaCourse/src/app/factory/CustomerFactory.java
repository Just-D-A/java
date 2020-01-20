package app.factory;

import domain.basket.Basket;
import domain.customer.Customer;
import domain.customer.CustomerImpl;

public class CustomerFactory {
    public static Customer createSimpleCustomer (String name, boolean isChild) {
        return new CustomerImpl(name, isChild, BasketFactory.createSimpleBasket());
    }
}

