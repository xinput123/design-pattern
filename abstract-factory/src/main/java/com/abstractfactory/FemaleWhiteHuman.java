package com.abstractfactory;

/**
 * 白色女性人种
 */
public class FemaleWhiteHuman extends AbstractWhiteHuman {
    @Override
    public void getSex() {
        System.out.println("女性白种人");
    }
}
