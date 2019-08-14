package com.factorymethod.multi;

/**
 * 黄种人创建工厂
 */
public class YellowHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new YelloHuman();
    }
}
