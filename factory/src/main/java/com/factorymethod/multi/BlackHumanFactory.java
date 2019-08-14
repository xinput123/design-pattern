package com.factorymethod.multi;

/**
 * 黑种人创建工厂
 */
public class BlackHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
