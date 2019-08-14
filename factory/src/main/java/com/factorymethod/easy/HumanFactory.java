package com.factorymethod.easy;

/**
 * 简单工厂模式
 * 去掉 AbstractFactory 抽象类，并把createHuman方法设置成静态方法
 */
public class HumanFactory {

    public static  <T extends Human> T createHuman(Class<T> cls) {
        // 定义一个生产的人种
        Human human = null;

        try {
            human = (T) Class.forName(cls.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) human;
    }
}
