package app.factory;

import domain.discount.Discount;
import domain.discount.DiscountImpl;

public class DiscountFactory{
    public static Discount create(double discountValue) {
        return new DiscountImpl(discountValue);
    }
}
