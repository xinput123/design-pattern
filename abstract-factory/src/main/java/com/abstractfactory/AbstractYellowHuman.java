package com.abstractfactory;

/**
 * 黄种人抽象工厂
 */
public abstract class AbstractYellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄种人的肤色是偏黄的");
    }

    @Override
    public void talk() {
        System.out.println("黄种人说话我大概能听懂");
    }
}
