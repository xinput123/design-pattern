package com.iterator;

import java.util.ArrayList;

/**
 * 项目迭代器
 */
public class ProjectIterator implements IProjectIterator {

    /**
     * 把所有的项目都放在ArrayList中
     */
    private ArrayList<IProject> projects = new ArrayList<>();

    private int currentItem = 0;

    public ProjectIterator(ArrayList<IProject> projects) {
        this.projects = projects;
    }

    /**
     * 判断是否还有元素
     */
    @Override
    public boolean hasNext() {
        boolean b = true;
        if (this.currentItem >= projects.size() || this.projects.get(this.currentItem) == null) {
            b = false;
        }
        return b;
    }

    @Override
    public Object next() {
        return (IProject) this.projects.get(this.currentItem++);
    }

    /**
     * 删除一个对象
     */
    @Override
    public void remove() {
        // 暂时不用这个方法
    }
}
