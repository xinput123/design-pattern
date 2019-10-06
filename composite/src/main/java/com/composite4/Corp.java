package com.composite4;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-06 12:21
 */
public abstract class Corp {

    /**
     * 公司每个人都有姓名
     */
    private String name = "";

    /**
     * 公司每个人都有职位
     */
    private String position = "";

    /**
     * 公司每个人都有薪水的
     */
    private int salary = 0;

    /**
     * 父节点是谁
     */
    private Corp parent = null;

    public Corp(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getInfo() {
        String info = "";
        info = "名称: " + this.name;
        info = info + "\t职位: " + this.position;
        info = info + "\t薪水: " + this.salary;
        return info;
    }

    public Corp getParent() {
        return parent;
    }

    public void setParent(Corp parent) {
        this.parent = parent;
    }
}
