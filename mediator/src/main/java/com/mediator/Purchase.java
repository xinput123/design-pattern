package com.mediator;

/**
 * 采购管理
 */
public class Purchase extends AbstractColleague {

    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    // 采购IBM电脑
    public void buyIBMcomputer(int number) {
        super.mediator.execute("purchase.buy", number);
    }

    // 不再采购IBM电脑
    public void refuseBuyIBM() {
        System.out.println("不再采购IBM电脑");
    }
}
