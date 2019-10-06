package com.composite1;

import java.util.ArrayList;

/**
 * 树枝接口
 */
public interface IBranch extends ICorp {

    /**
     * 能够增加小兵(树叶节点)，或者是经理(树枝节点)
     */
    void addSubordinate(ICorp corp);

    /**
     * 获得下属的信息
     */
    ArrayList<ICorp> getSubordinate();

}
