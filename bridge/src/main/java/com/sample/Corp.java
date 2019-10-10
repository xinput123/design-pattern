package com.sample;

/**
 * 抽象公司
 */
public abstract class Corp {

    /**
     * 生产
     */
    protected abstract void produce();

    /**
     * 销售
     */
    protected abstract void sell();

    public void makeMoney() {
        // 每个公司都一样，先生产
        this.produce();
        this.sell();
    }
}
