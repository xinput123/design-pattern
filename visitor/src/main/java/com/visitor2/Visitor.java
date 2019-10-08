package com.visitor2;

/**
 * 具体访问者
 */
public class Visitor implements IVisitor {

    /**
     * 部门经理的工资系数是5
     */
    private final static int MANAGER_COEFFICIENT = 5;

    /**
     * 员工的工资系数是2
     */
    private final static int COMMONEMPLOYEE_COEFFICIENT = 2;

    /**
     * 普通员工的工资总和
     */
    private int commonTotalSalary = 0;

    /**
     * 部门经理员工的工资总和
     */
    private int managerTotalSalary = 0;

    private void calManagerSalary(int salary) {
        this.managerTotalSalary = this.managerTotalSalary + salary * MANAGER_COEFFICIENT;
    }

    private void calCommonSalary(int salary) {
        this.commonTotalSalary = this.commonTotalSalary + salary * COMMONEMPLOYEE_COEFFICIENT;
    }

    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(this.getCommonEmployeeInfo(commonEmployee));
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
    }

    @Override
    public int getTotalSalary() {
        return this.commonTotalSalary + this.managerTotalSalary;
    }

    /**
     * 组装出基本信息
     */
    private String getBasicInfo(Employee employee) {
        String info = "姓名: " + employee.getName() + "\t";
        info = info + "性别: " + (employee.getSex() == Employee.FEMALE ? "女" : "男") + "\t";
        info = info + "薪水: " + employee.getSalary() + "\t";

        return info;
    }

    /**
     * 组装部门经理的信息
     */
    private String getManagerInfo(Manager manager) {
        String basicInfo = getBasicInfo(manager);
        String otherInfo = "业绩: " + manager.getPerformance();
        return basicInfo + otherInfo;
    }

    /**
     * 组装普通员工的信息
     */
    private String getCommonEmployeeInfo(CommonEmployee commonEmployee) {
        String basicInfo = getBasicInfo(commonEmployee);
        String otherInfo = "工作: " + commonEmployee.getJob();
        return basicInfo + otherInfo;
    }
}
