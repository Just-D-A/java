package interactor;

import domain.cashDesk.CashDesk;
import domain.discount.Discount;
import domain.discount.discountprocess.DiscountProcess;
import domain.product.Product;
import domain.storage.Storage;
import domain.supermarket.Supermarket;

import java.util.ArrayList;

public class SupermarketInteractor{
    public static void open(Supermarket supermarket) {
        supermarket.open();
    }

    public static void addProduct(Supermarket supermarket, Product product) {
        Storage storage = supermarket.getStorage();
        storage.addProduct(product);
    }

    public static ArrayList<Product> getProducts(Supermarket supermarket) {
        Storage storage = supermarket.getStorage();
        ArrayList<Product> products = storage.getAllProducts();
        return products;
    }

    public static void addDiscount(Supermarket supermarket, Product product, Discount discount) {
        DiscountProcess discountProcess = supermarket.getDiscountProcess();
        discountProcess.addDiscount(product, discount);
        System.out.println("Add " + discount.getPrice() + "% discount for " + product.getName());
    }


    public static void close(Supermarket supermarket) {
        CashDesk cashDesk = supermarket.getCashDesk();
        System.out.println("Cash in CashDesk: " + cashDesk.getCash() + " RUB");
        supermarket.close();
    }
}
