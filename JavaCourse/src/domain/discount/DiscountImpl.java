package domain.discount;

public class DiscountImpl implements Discount{
    private final double price;

    public DiscountImpl(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
