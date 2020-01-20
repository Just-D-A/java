package app.factory;

import domain.cashDesk.CashDesk;
import domain.cashDesk.CashDeskImpl;
import domain.discount.discountprocess.DiscountProcess;
import domain.discount.discountprocess.DiscountProcessImpl;
import domain.queue.Queue;
import domain.queue.QueueImpl;

public class CashDeskFactory {
    public static CashDesk createSimpleCashDesk(DiscountProcess discountProcess) {
        Queue queue = new QueueImpl();
        return new CashDeskImpl(queue, discountProcess);
    }


}
