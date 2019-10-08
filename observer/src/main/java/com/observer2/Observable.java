package com.observer2;

/**
 * 被观察者接口
 */
public interface Observable {

    /**
     * 增加一个观察者
     */
    void addObserver(Observer observer);

    /**
     * 增加一个观察者
     */
    void deleteObserver(Observer observer);

    /**
     * 既然要观察，我发生改变了他也应该有所动作，通知观察者
     */
    void notifyObserver(String context);

}
