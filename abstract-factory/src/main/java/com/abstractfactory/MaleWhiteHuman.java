package com.abstractfactory;

/**
 * 白色男性人种
 */
public class MaleWhiteHuman extends AbstractWhiteHuman {
    @Override
    public void getSex() {
        System.out.println("男性白种人");
    }
}
