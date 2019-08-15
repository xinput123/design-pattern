package com.abstractfactory;

/**
 * 生产女性的工厂
 */
public class FemaleFactory implements HumanFactory {
    /**
     * 制造一个女性黄色人种
     */
    @Override
    public Human createYelloHuman() {
        return new FemaleYellowHuman();
    }

    /**
     * 制造一个女性白色人种
     */
    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    /**
     * 制造一个女性黑色人种
     */
    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
}
