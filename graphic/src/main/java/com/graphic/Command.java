package com.graphic;

/**
 * 抽象类，只有一个方法execute，作用就是执行命令
 */
public abstract class Command {

    // 把三个组都定义好，子类可以直接使用
    protected RequirmentGroup rg = new RequirmentGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();

    /**
     * 执行方法
     */
    public abstract void execute();
}
