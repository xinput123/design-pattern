package com.state;

/**
 * 电梯接口
 */
public interface ILift {

    /**
     * 开门状态
     */
    int OPENING_STATE = 1;

    /**
     * 关门状态
     */
    int CLOSING_STATE = 2;

    /**
     * 运行状态
     */
    int RUNNING_STATE = 3;

    /**
     * 停止状态
     */
    int STOPPING_STATE = 4;

    void setState(int state);

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
