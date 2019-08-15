package com.abstractfactory;

/**
 * 黑色男性人种
 */
public class MaleBlackHuman extends AbstractBlackHuman {
    @Override
    public void getSex() {
        System.out.println("男性黑种人");
    }
}
