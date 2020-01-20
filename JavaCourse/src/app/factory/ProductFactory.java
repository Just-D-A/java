package app.factory;

import domain.product.Product;
import domain.product.ProductImpl;
import domain.product.pieceproduct.PieceProduct;
import domain.product.pieceproduct.PieceProductImpl;
import domain.product.weightproduct.WeightProduct;
import domain.product.weightproduct.WeightProductImpl;

public class ProductFactory {
    public static Product createWeightProduct(String name, double weight, double pricePerKilogram, boolean isForChild) {
        WeightProduct weightProduct = new WeightProductImpl(weight, pricePerKilogram);
        return new ProductImpl(name, weightProduct, isForChild);
    }

    public static Product createPieceProduct(String name, double price, boolean isForChild) {
        PieceProduct pieceProduct = new PieceProductImpl(price);
        return new ProductImpl(name, pieceProduct, isForChild);
    }
}
