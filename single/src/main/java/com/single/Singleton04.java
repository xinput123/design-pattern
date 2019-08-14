package com.single;

/**
 * @Author: xinput
 * @Date: 2016-02-28 10:30
 * @Versioin: 1.0.0
 * @Description: 单例 - 饿汉（变种）
 * 和饿汉方式差不多，都是在类初始化的时候就实例化instance
 */
public class Singleton04 {
    private static Singleton04 singleton = new Singleton04();

    public Singleton04() {
    }

    public static Singleton04 getInstance() {
        return singleton;
    }
}
