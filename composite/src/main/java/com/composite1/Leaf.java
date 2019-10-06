package com.composite1;

/**
 * 树叶接口
 */
public class Leaf implements ILeaf {
    /**
     * 小兵也有名称
     */
    private String name = "";

    /**
     * 小兵也有职位
     */
    private String position = "";

    /**
     * 小兵也有薪水
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
