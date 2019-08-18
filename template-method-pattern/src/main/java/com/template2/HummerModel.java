package com.template2;

/**
 * 扩展后的抽象悍马模型
 */
public abstract class HummerModel {

    /**
     * 发动
     */
    protected abstract void start();

    /**
     * 停止
     */
    protected abstract void stop();

    /**
     * 喇叭
     */
    protected abstract void alarm();

    /**
     * 引擎
     */
    protected abstract void enginBoom();

    /**
     * 车子运行
     */
    final public void run() {
        this.start();
        this.enginBoom();
        // 自己控制喇叭的声音，
        if (this.isAlarm()) {
            this.alarm();
        }
        this.stop();
    }

    /**
     * 钩子方法，默认喇叭是会响的
     * isAlarm() 确认各个型号的悍马是否需要声音，由各个实现类覆盖该方法，同时其他
     * 的基本方法不需要对外提供访问，所以都设置为protected类型
     *
     * @return
     */
    protected boolean isAlarm() {
        return true;
    }
}
