package com.factorymethod;

/**
 * 白种人
 */
public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白种人的肤色是偏白的");
    }

    @Override
    public void talk() {
        System.out.println("白种人说话我也听不懂");
    }
}
