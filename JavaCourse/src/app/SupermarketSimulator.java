package app;

import app.factory.CustomerFactory;
import app.factory.DiscountFactory;
import app.factory.ProductFactory;
import app.factory.SupermarketFactory;
import app.utils.Randomizer;
import domain.cashDesk.CashDesk;
import domain.customer.Customer;
import domain.discount.Discount;
import domain.product.Product;
import domain.supermarket.Supermarket;
import interactor.CashDeskInteractor;
import interactor.CustomerInteractor;
import interactor.SupermarketInteractor;

import java.util.ArrayList;

public class SupermarketSimulator{
    private Supermarket supermarket;

    public void runSimulator() {
        supermarket = SupermarketFactory.createSimpleSupermarket();

        addRandomProducts();
        addRandomDiscounts();

        SupermarketInteractor.open(supermarket);

        ArrayList<Customer> customers = addRandomCustomers();

        Shopping(customers);
        CashDeskWork();

        SupermarketInteractor.close(supermarket);
    }

    private void CashDeskWork() {
        CashDesk cashDesk = supermarket.getCashDesk();
        while (!CashDeskInteractor.isQueueEmpty(cashDesk)) {

            Customer customer = CashDeskInteractor.getQueueCustomer(cashDesk);
            double amount = CashDeskInteractor.scanProducts(cashDesk, customer);
            CustomerInteractor.payAmount(customer, amount);
            System.out.println("___");

        }

    }

    private void Shopping(ArrayList<Customer> customers) {
        System.out.println("Lets go");
        for (Customer customer : customers) {
            if(getRandomProduct() != null) {
            CustomerInteractor.putProductToBasket(customer, getRandomProduct());
            CustomerInteractor.enterQueue(customer, supermarket.getCashDesk());
            System.out.println("___");
            }
        }
        System.out.println("***");
    }

    private Product getRandomProduct() {
        ArrayList<Product> products = SupermarketInteractor.getProducts(supermarket);
        if (products.size() != 0) {
            return products.get(Randomizer.getRandomNumberInRange(0, products.size() - 1));
        }
        return null;
    }

    private ArrayList<Customer> addRandomCustomers() {
        ArrayList<Customer> customers = new ArrayList<>();

        for (int i = 0; i < Randomizer.getRandomNumberInRange(2, 10); i++) {
            Customer customer = CustomerFactory.createSimpleCustomer("Bob", Randomizer.getRandomBoolean());
            CustomerInteractor.enterTheSupermarket(customer, supermarket);

            customers.add(customer);
        }

        System.out.println("***");
        return customers;
    }

    private void addRandomDiscounts() {
        for (Product product : SupermarketInteractor.getProducts(supermarket)) {
            Discount discount = DiscountFactory.create(10);
            SupermarketInteractor.addDiscount(supermarket, product, discount);
        }

        System.out.println("***");
    }

    private void addRandomProducts() {
        for (int i = 0; i < Randomizer.getRandomNumberInRange(3, 10); i++) {
            Product product = ProductFactory.createWeightProduct("nuts", 10, 10, true);
            SupermarketInteractor.addProduct(supermarket, product);
        }
        System.out.println("***");
    }
}
