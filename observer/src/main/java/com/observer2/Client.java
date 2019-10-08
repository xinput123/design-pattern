package com.observer2;

public class Client {

    public static void main(String[] args) {
        // 三个观察者
        Observer lisi = new Lisi();
        Observer wangSan = new WangSan();
        Observer wangSi = new WangSi();

        // 定义出韩非
        HanFeiZi hanFeiZi = new HanFeiZi();

        // 描述场景，有三个人在观察韩非子
        hanFeiZi.addObserver(lisi);
        hanFeiZi.addObserver(wangSan);
        hanFeiZi.addObserver(wangSi);

        // 观察韩非子
        hanFeiZi.haveBreadfast();
    }
}
