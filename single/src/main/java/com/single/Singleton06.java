package com.single;

/**
 * @Author: xinput
 * @Date: 2016-02-28 10:39
 * @Versioin: 1.0.0
 * @Description: 单例，枚举(推荐)
 */
public class Singleton06 {

    private Singleton06() {
    }

    ;

    private static Singleton06 getInstance() {
        return SingletonHolder.INSTANCE.instance;
    }

    public enum SingletonHolder {
        INSTANCE;

        private Singleton06 instance = null;

        SingletonHolder() {
            instance = new Singleton06();
        }

        public Singleton06 getInstance() {
            return instance;
        }
    }
}
