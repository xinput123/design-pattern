package com.factorymethod.multi;

/**
 * Human 接口是人类的总称，有三个实现类
 */
public interface Human {

    /**
     * 每个人种的皮肤都有相应的颜色
     */
    void getColor();

    /**
     * 人类会说话
     */
    void talk();
}
