package domain.product;

import domain.product.pieceproduct.PieceProduct;
import domain.product.weightproduct.WeightProduct;

public class ProductImpl implements Product{
    private final String name;
    private WeightProduct weightProduct = null;
    private PieceProduct pieceProduct = null;
    private final boolean isForChild;


    public ProductImpl(String name, WeightProduct weightProduct, boolean isForChild) {
        this.name = name;
        this.weightProduct = weightProduct;
        this.isForChild = isForChild;
    }

    public ProductImpl(String name, PieceProduct pieceProduct, boolean isForChild) {
        this.name = name;
        this.pieceProduct = pieceProduct;
        this.isForChild = isForChild;
    }

    @Override
    public WeightProduct getWeightProduct() {
        return weightProduct;
    }

    @Override
    public PieceProduct getPieceProduct() {
        return pieceProduct;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean getIsForChild() {
        return isForChild;
    }
}
