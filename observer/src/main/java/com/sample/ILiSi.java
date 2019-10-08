package com.sample;

/**
 * 抽象观察者李斯
 */
public interface ILiSi {
    /**
     * 一发现别人有动静，自己就要动起来
     */
    void update(String context);
}
