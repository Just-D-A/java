package domain.discount.discountprocess;

import domain.discount.Discount;
import domain.product.Product;

public interface DiscountProcess{
    void addDiscount(Product product, Discount discount);
    boolean hasDiscount(Product product);
    Discount getDiscount(Product product);
}
