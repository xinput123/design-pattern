package com.sample;

/**
 * 叶子节点的实现
 */
public class Leaf implements ILeaf {

    /**
     * 叶子的名称
     */
    private String name = "";

    /**
     * 叶子的职位
     */
    private String position = "";

    /**
     * 叶子的薪水
     */
    private int salary = 0;

    public Leaf(String name, String position, int salary) {
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
}
