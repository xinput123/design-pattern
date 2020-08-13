package com.single;

/**
 * @Author: xinput
 * @Date: 2016-02-28 10:21
 * @Versioin: 1.0.0
 * @Description: 单例 - DCL 双重检查锁定
 */
public class Singleton07 {
    /**
     * volatile 在DCL中非常重要，如果不禁止指令重排序，这里会出问题
     * <p>
     * 分析： 没有 volatile关键词修饰会发生什么问题。
     * 实例化一个对象分为三步：
     * 1、分配内存空间
     * 2、初始化对象
     * 3、将内存空间的地址赋值给对应的引用
     * 因为由于重排序的作用，步骤 2 、3会发生重排序。如果2、3发生了重排序就会导致第二个判断会出错，singleton != null，但是它其实仅仅只是一个
     * 地址而已，此时对象还没有被初始化，所以return的singleton对象是一个没有被初始化的对象，这个时候，另外一个线程访问的局势没有被初始化的singleton对象
     */
    private static volatile Singleton07 singleton;

    private Singleton07() {
    }

    public static Singleton07 getInstance() {
        if (null == singleton) {                           // 1
            synchronized (Singleton07.class) {          // 2
                if (null == singleton) {                   // 3
                    singleton = new Singleton07();     // 4
                }
            }
        }

        return singleton;
    }
}
