package com.abstractfactory;

/**
 * 生产男性的工厂
 */
public class MaleFactory implements HumanFactory {
    /**
     * 制造一个男性黄色人种
     */
    @Override
    public Human createYelloHuman() {
        return new MaleYellowHuman();
    }

    /**
     * 制造一个男性白色人种
     */
    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    /**
     * 制造一个男性黑色人种
     */
    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
}
