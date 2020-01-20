package domain.product.pieceproduct;

public class PieceProductImpl implements PieceProduct{
    private final double price;

    public PieceProductImpl(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

