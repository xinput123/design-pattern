package com.iterator;

import java.util.ArrayList;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-05 17:18
 */
public class Project implements IProject {

    private ArrayList<IProject> projects = new ArrayList<>();

    /**
     * 项目名称
     */
    private String name = "";

    /**
     * 项目成员数量
     */
    private int num = 0;

    /**
     * 项目费用
     */
    private int cost = 0;

    public Project() {
    }

    /**
     * 定义一个私有的构造函数，把所有需要看到的信息存储起立
     */
    private Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public void add(String name, int num, int cost) {
        this.projects.add(new Project(name, num, cost));
    }

    @Override
    public String getProjectInfo() {
        String info = "";

        // 获得项目的名称
        info = info + "项目名称是: " + this.name;

        // 获得项目人数
        info = info + "\t项目人数: " + this.num;

        // 项目费用
        info = info + "\t项目费用: " + this.cost;

        return info;
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(this.projects);
    }
}
