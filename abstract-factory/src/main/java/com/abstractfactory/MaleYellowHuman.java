package com.abstractfactory;

/**
 * 黄色男性人种
 */
public class MaleYellowHuman extends AbstractYellowHuman{
    @Override
    public void getSex() {
        System.out.println("男性黄种人");
    }
}
