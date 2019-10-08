package com.visitor;

/**
 * 访问者实现
 */
public class Visitor implements IVisitor {

    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(this.getCommonEmployeeInfo(commonEmployee));
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
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
