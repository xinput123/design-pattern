package com.abstractfactory;

/**
 * 黄色女性人种
 */
public class FemaleYellowHuman extends AbstractYellowHuman{
    @Override
    public void getSex() {
        System.out.println("女性黄种人");
    }
}
