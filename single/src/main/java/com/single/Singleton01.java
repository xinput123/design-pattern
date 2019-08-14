package com.single;

/**
 * @Author: xinput
 * @Date: 2016-02-28 10:21
 * @Versioin: 1.0.0
 * @Description: 单例 - 懒汉式、线程不安全
 */
public class Singleton01 {
    private static Singleton01 singleton;

    private Singleton01() {
    }

    public static Singleton01 getInstance() {
        if (null == singleton) {
            singleton = new Singleton01();
        }

        return singleton;
    }
}
