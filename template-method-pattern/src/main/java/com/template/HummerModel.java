package com.template;

/**
 * 抽象悍马模型
 * 因为在 simple中，H1和H2实现类的run 方法一模一样，所以run方法应该实现在抽象类上
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
    public void run() {
        this.start();
        this.enginBoom();
        this.alarm();
        this.stop();
    }
}
