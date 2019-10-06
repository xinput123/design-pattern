package com.sample;

import java.util.ArrayList;

/**
 * 根节点接口
 */
public interface IRoot {

    /**
     * 得到总经理的消息
     */
    String getInfo();

    /**
     * 总经理下边要有小兵，那要能增加小兵，比如研发部总经理，这是个树枝节点
     */
    void add(IBranch branch);

    /**
     * 增加树叶节点
     */
    void add(ILeaf leaf);

    /**
     * 遍历
     */
    ArrayList getSibordinateInfo();
}
