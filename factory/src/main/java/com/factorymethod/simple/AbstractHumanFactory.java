package com.factorymethod.simple;

/**
 * 抽象类，定义工厂的基本方法
 */
public abstract class AbstractHumanFactory {

    /**
     * 女娲烧制一个人类
     *
     * @param cls
     * @param <T>
     * @return
     */
    public abstract <T extends Human> T createHuman(Class<T> cls);

}
