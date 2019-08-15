package com.abstractfactory;

/**
 * 黑种人抽象工厂
 */
public abstract class AbstractBlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑种人的肤色是偏黑的");
    }

    @Override
    public void talk() {
        System.out.println("黑种人说话我也听不懂");
    }
}
