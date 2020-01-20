package domain.storage;

import domain.customer.Customer;
import domain.product.Product;

import java.beans.Customizer;
import java.util.ArrayList;

public class StorageImpl implements Storage {

    private ArrayList<Product> products;

    public StorageImpl() {
        this.products = new ArrayList<>();
    }



    @Override
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Added product: " + product.getName() + " to storage");
    }

    @Override
    public void deleteProduct(Product product) {
        this.products.remove(product);
        System.out.println("Delete product: " + product.getName() + " from storage");
    }

    @Override
    public Product findProduct(String findName) {
        for(Product storageProduct: products) {
            if(storageProduct.getName().equals(findName)) {
                return  storageProduct;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Product> getAllProducts() {
        return products;
    }

    @Override
    public void getInfo() {
        for(Product product: products) {
            System.out.println(product.getName());
        }
    }


}
