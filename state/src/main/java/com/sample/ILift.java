package com.sample;

/**
 * 电梯接口
 */
public interface ILift {

    /**
     * 电梯门开启动作
     */
    void open();

    /**
     * 电梯门关闭动作
     */
    void close();

    /**
     * 电梯门能上能下
     */
    void run();

    /**
     * 电梯门停止动作
     */
    void stop();
}
