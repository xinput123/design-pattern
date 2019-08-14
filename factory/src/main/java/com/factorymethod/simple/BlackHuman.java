package com.factorymethod.simple;

/**
 * 黑种人
 */
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑人的肤色是黑色的");
    }

    @Override
    public void talk() {
        System.out.println("黑人的语言有很多种");
    }
}
