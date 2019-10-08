package com.visitor2;

/**
 * 访问者接口
 */
public interface IVisitor {

    /**
     * 首先，我们可以访问普通员工
     */
    void visit(CommonEmployee commonEmployee);

    /**
     * 其次，我们可以访问部门经理
     */
    void visit(Manager manager);

    /**
     * 统计所有员工工资之和
     */
    int getTotalSalary();
}
