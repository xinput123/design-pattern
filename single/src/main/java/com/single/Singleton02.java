package com.single;

/**
 * @Author: xinput
 * @Date: 2016-02-28 10:21
 * @Versioin: 1.0.0
 * @Description: 单例 - 懒汉式，线程安全，但是效率低下
 */
public class Singleton02 {
    private static Singleton02 singleton;

    private Singleton02() {
    }

    public static synchronized Singleton02 getInstance() {
        if (null == singleton) {
            singleton = new Singleton02();
        }

        return singleton;
    }
}
