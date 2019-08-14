package com.factorymethod.multi;

/**
 * 白种人创建工厂
 */
public class WhiteHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}
