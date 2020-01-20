package domain.product.weightproduct;

public class WeightProductImpl implements WeightProduct{

    private final double weight;
    private final double pricePerKilogram;

    public WeightProductImpl(double weight, double pricePerKilogram) {
        this.weight = weight;
        this.pricePerKilogram = pricePerKilogram;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public double getKilogramCost() {
        return pricePerKilogram;
    }

    @Override
    public double getCost() {
        return weight * pricePerKilogram;
    }
}
