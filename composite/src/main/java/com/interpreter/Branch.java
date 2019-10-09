package com.interpreter;

import java.util.ArrayList;

/**
 * 分支的节点实现
 */
public class Branch implements IBranch {

    /**
     * 存储子节点的信息
     */
    private ArrayList subordinateList = new ArrayList();

    /**
     * 树枝节点的名称
     */
    private String name = "";

    /**
     * 树枝节点的职位
     */
    private String position = "";

    /**
     * 树枝节点的薪水
     */
    private int salary = 0;

    public Branch(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        String info = "";
        info = "名称: " + this.name;
        info = info + "\t职位: " + this.position;
        info = info + "\t薪水: " + this.salary;
        return info;
    }

    @Override
    public void add(IBranch branch) {
        this.subordinateList.add(branch);
    }

    @Override
    public void add(ILeaf leaf) {
        this.subordinateList.add(leaf);
    }

    @Override
    public ArrayList getSubordinateInfo() {
        return this.subordinateList;
    }
}
