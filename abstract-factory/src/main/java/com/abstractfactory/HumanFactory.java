package com.abstractfactory;

/**
 * 创建的工厂
 */
public interface HumanFactory {

    /**
     * 制造一个黄色人种
     */
    Human createYelloHuman();

    /**
     * 制造一个白色人种
     */
    Human createWhiteHuman();

    /**
     * 制造一个黑色人种
     */
    Human createBlackHuman();
}
