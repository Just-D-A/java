package app.factory;

import domain.discount.discountprocess.DiscountProcess;
import domain.discount.discountprocess.DiscountProcessImpl;
import domain.storage.Storage;
import domain.storage.StorageImpl;
import domain.supermarket.Supermarket;
import domain.supermarket.SupermarketImpl;

public class SupermarketFactory{
    public static Supermarket createSimpleSupermarket() {
        Storage storage = createSimpleStorage();
        DiscountProcess discountProcess = createSimpleDiscountProcess();
        return new SupermarketImpl(storage, discountProcess, CashDeskFactory.createSimpleCashDesk(discountProcess));
    }

    public static Storage createSimpleStorage() {
        return new StorageImpl();
    }

    private static DiscountProcess createSimpleDiscountProcess() {
        return new DiscountProcessImpl();
    }
}
