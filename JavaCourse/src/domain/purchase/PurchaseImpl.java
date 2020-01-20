package domain.purchase;

import java.util.ArrayList;

public class PurchaseImpl implements Purchase {
    private class Product {
        String productInfo;
        double amount;
        double discountValue;

        private Product(String productInfo, double amount, double discountValue) {
            this.productInfo = productInfo;
            this.amount = amount;
            this.discountValue = discountValue;
        }
    }

    private ArrayList<Product> products;

    public PurchaseImpl() {
        products = new ArrayList<>();
    }

    @Override
    public void addProduct(String productInfo, double amount, double discountValue) {
        Product product = new Product(productInfo, amount, discountValue);
        products.add(product);
    }

    @Override
    public String getAsString() {
        StringBuilder str = new StringBuilder();

        for (Product product: products) {
            str.append(product.productInfo).append(", amount: ").append(product.amount).append(", discount value: ").append(product.discountValue).append("%\n");
        }

        return str.toString();
    }
}