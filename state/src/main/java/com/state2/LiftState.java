package com.state2;

/**
 * 抽象电梯状态
 */
public abstract class LiftState {

    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    /**
     * 电梯门开启动作
     */
    public abstract void open();

    /**
     * 电梯门关闭动作
     */
    public abstract void close();

    /**
     * 电梯门能上能下
     */
    public abstract void run();

    /**
     * 电梯门停止动作
     */
    public abstract void stop();
}
