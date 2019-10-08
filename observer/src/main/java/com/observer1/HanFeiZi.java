package com.observer1;

/**
 * 通过聚集方式的被观察者
 */
public class HanFeiZi implements IHanFeiZi {

    /**
     * 把李斯声明出来
     */
    private ILiSi lisi = new LiSi();

    @Override
    public void haveBreadfast() {
        System.out.println("韩非子：开始吃饭了...");
        this.lisi.update("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子：开始娱乐了...");
        this.lisi.update("韩非子在娱乐");
    }
}
