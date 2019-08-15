package com.abstractfactory;

/**
 * 黑色女性人种
 */
public class FemaleBlackHuman extends AbstractBlackHuman {
    @Override
    public void getSex() {
        System.out.println("女性黑种人");
    }
}
