package com.simple;

import java.util.ArrayList;

/**
 * 车辆模型
 */
public abstract class CarModel {

    // 这个参数决定了基本方法执行的顺序
    private ArrayList<String> sequence = new ArrayList();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run() {
        for (int i = 0; i < this.sequence.size(); i++) {
            String actionName = this.sequence.get(i);
            if (actionName.equalsIgnoreCase("start")) {
                this.start();
            } else if (actionName.equalsIgnoreCase("stop")) {
                this.stop();
            } else if (actionName.equalsIgnoreCase("alarm")) {
                this.alarm();
            } else if (actionName.equalsIgnoreCase("engin boom")) {
                this.engineBoom();
            }
        }
    }

    final public void setSequence(ArrayList sequence) {
        this.sequence = sequence;
    }
}
