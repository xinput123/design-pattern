package com.abstractfactory;

/**
 * 白种人抽象工厂
 */
public abstract class AbstractWhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白种人的肤色是偏白的");
    }

    @Override
    public void talk() {
        System.out.println("白种人说话我也听不懂");
    }
}
