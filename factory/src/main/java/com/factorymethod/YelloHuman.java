package com.factorymethod;

/**
 * 黄种人
 */
public class YelloHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄种人的肤色是黄色的");
    }

    @Override
    public void talk() {
        System.out.println("大部分黄种人说话能听懂");
    }
}
