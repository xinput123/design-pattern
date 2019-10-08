package com.observer1;

/**
 * 通过聚集方式的场景类
 */
public class Client {
    public static void main(String[] args) {
        // 定义出韩非
        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.haveBreadfast();
        hanFeiZi.haveFun();
    }
}
