package com.simple;

/**
 * 抽象悍马模型
 */
public abstract class HummerModel {

    /**
     * 发动
     */
    public abstract void start();

    /**
     * 停止
     */
    public abstract void stop();

    /**
     * 喇叭
     */
    public abstract void alarm();

    /**
     * 引擎
     */
    public abstract void enginBoom();

    /**
     * 车子运行
     */
    public abstract void run();
}
