package com.interpreter;

import java.util.ArrayList;

/**
 * 其他有分支的节点接口
 */
public interface IBranch {

    /**
     * 获得信息
     */
    String getInfo();

    /**
     * 增加数据节点，例如研发部下设的研发一组
     */
    void add(IBranch branch);

    /**
     * 增加叶子节点
     */
    void add(ILeaf leaf);

    /**
     * 获得下级信息
     */
    ArrayList getSubordinateInfo();
}
