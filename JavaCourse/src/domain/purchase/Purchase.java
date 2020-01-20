package domain.purchase;

public interface Purchase {
        void addProduct(String productInfo, double amount, double discountValue);
        String getAsString();
}
