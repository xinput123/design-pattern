package com.observer2;

import java.util.ArrayList;

/**
 * 被观察者实现类
 */
public class HanFeiZi implements Observable, IHanFeiZi {

    /**
     * 存放所有的观察者
     */
    private ArrayList<Observer> observables = new ArrayList();

    @Override
    public void haveBreadfast() {
        System.out.println("韩非子：开始吃饭了...");
        this.notifyObserver("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子：开始娱乐了...");
        this.notifyObserver("韩非子在娱乐");
    }

    @Override
    public void addObserver(Observer observer) {
        this.observables.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observables.remove(observer);
    }

    @Override
    public void notifyObserver(String context) {
        for (Observer observer : observables) {
            observer.update(context);
        }
    }
}
