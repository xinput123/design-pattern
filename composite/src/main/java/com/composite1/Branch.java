package com.composite1;

import java.util.ArrayList;

/**
 * 树枝实现类
 */
public class Branch implements IBranch {

    /**
     * 领导也是人，也有名字
     */
    private String name = "";

    /**
     * 领导和领导不同，有职位区别
     */
    private String position = "";

    /**
     * 领导也是拿薪水的
     */
    private int salary = 0;

    /**
     * 领导下边有哪些下级领导和小兵
     */
    private ArrayList<ICorp> subordinateList = new ArrayList();

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
    public void addSubordinate(ICorp corp) {
        this.subordinateList.add(corp);
    }

    @Override
    public ArrayList<ICorp> getSubordinate() {
        return this.subordinateList;
    }
}
