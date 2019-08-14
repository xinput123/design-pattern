package com.single;

/**
 * @Author: xinput
 * @Date: 2016-02-28 10:30
 * @Versioin: 1.0.0
 * @Description: 单例 - 饿汉
 * 这种方式基于classloder机制避免了多线程的同步问题，不过，instance在类装载时就实例化，虽然导致类装载的原因有很多种，在单例模式中大多
 * 数都是调用getInstance方法， 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化instance显然没有达到lazy loading的效果。
 */
public class Singleton03 {
    private static Singleton03 singleton = new Singleton03();

    public Singleton03() {
    }

    public static Singleton03 getInstance() {
        return singleton;
    }
}
