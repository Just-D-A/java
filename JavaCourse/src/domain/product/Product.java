package domain.product;

import domain.product.pieceproduct.PieceProduct;
import domain.product.weightproduct.WeightProduct;

public interface Product {
    WeightProduct getWeightProduct();
    PieceProduct getPieceProduct();
    String getName();
    boolean getIsForChild();
}
