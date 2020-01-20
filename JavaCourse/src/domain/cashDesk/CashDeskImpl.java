package domain.cashDesk;

import domain.discount.Discount;
import domain.discount.discountprocess.DiscountProcess;
import domain.product.Product;
import domain.product.pieceproduct.PieceProduct;
import domain.product.weightproduct.WeightProduct;
import domain.purchase.Purchase;
import domain.purchase.PurchaseImpl;
import domain.queue.Queue;

public class CashDeskImpl implements CashDesk{
    private double cash;
    private final Queue queue;
    private Purchase purchase;
    private double amount;
    private DiscountProcess discountProcess;

    public CashDeskImpl(Queue queue, DiscountProcess discountProcess) {
        this.cash = 0;
        this.queue = queue;
        this.discountProcess = discountProcess;
    }

    public double getCash() {
        return cash;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    public Queue getQueue() {
        return queue;
    }

    @Override
    public void initPurchase() {
        purchase = new PurchaseImpl();
        amount = 0;
    }

    @Override
    public void scanProduct(Product product) {
        double amount = 0;

        if (product.getPieceProduct() != null) {
            PieceProduct pieceProduct = product.getPieceProduct();
            amount = 1 * pieceProduct.getPrice();
        } else if (product.getWeightProduct() != null) {
            WeightProduct weightProduct = product.getWeightProduct();
            amount = weightProduct.getCost();
        }

        double discountValue = 0;

        if (discountProcess.hasDiscount(product)) {
            Discount discount = discountProcess.getDiscount(product);
            discountValue = discount.getPrice();
            amount = amount * (1 - discountValue / 100);
        }

        this.amount += amount;
//        purchase.addProduct(product.getName(), amount, discountValue);
    }


    public void addCash() {
        cash += amount;
        //System.out.println("CashDesk updated");
    }
}
