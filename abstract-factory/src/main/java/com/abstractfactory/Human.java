package com.abstractfactory;

/**
 * 人种接口
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

    /**
     * 性别
     */
    void getSex();
}
