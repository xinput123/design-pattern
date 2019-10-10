package com.bridge2;

/**
 * 抽象公司类
 */
public abstract class Corp {

    private Product product;

    public Corp(Product product) {
        this.product = product;
    }

    public void makeMoney() {
        this.product.beProducted();
        this.product.beSelled();
    }
}
