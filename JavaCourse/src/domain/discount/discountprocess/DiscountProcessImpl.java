package domain.discount.discountprocess;

import domain.discount.Discount;
import domain.product.Product;

import java.util.HashMap;

public class DiscountProcessImpl implements DiscountProcess{
    private final HashMap<Product, Discount> discountHashMap;

    public DiscountProcessImpl() {
        discountHashMap = new HashMap<>();
    }

    @Override
    public void addDiscount(Product product, Discount discount) {
        discountHashMap.put(product, discount);
        //System.out.println(discountHashMap.containsKey(product));
    }

    @Override
    public boolean hasDiscount(Product product) {

        return discountHashMap.containsKey(product);
    }

    @Override
    public Discount getDiscount(Product product) {
        return discountHashMap.get(product);
    }


}
