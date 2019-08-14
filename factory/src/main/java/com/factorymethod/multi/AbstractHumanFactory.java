package com.factorymethod.multi;

/**
 * 多工厂模式的抽象工厂类
 */
public abstract class AbstractHumanFactory {

    /**
     * 女娲烧制一个人类
     *
     * @return
     */
    public abstract Human createHuman();

}
