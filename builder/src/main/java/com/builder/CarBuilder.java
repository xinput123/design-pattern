package com.builder;

import java.util.ArrayList;

/**
 * 抽象汽车组装者
 */
public abstract class CarBuilder {

    /**
     * 这个参数决定了基本方法执行的顺序
     *
     * @param sequence
     */
    public abstract void setSequence(ArrayList<String> sequence);

    public abstract CarModel getCarModel();
}
