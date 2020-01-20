package domain.storage;

import domain.customer.Customer;
import domain.product.Product;

import java.util.ArrayList;

public interface Storage {
    void addProduct(Product product);
    void deleteProduct(Product product);
    Product findProduct(String findName);
    ArrayList<Product> getAllProducts();
    void getInfo();
}
