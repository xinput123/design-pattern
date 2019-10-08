package com.visitor2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-08 23:21
 */
public class Client {
    public static void main(String[] args) {
        IVisitor visitor = new Visitor();
        for (Employee employee : mockEmployee()) {
            employee.accept(visitor);
        }
        System.out.println("本公司的月工资总额是: " + visitor.getTotalSalary());
    }

    public static List<Employee> mockEmployee() {
        List<Employee> employees = new ArrayList();

        CommonEmployee zhangsan = new CommonEmployee();
        zhangsan.setJob("编写java程序，绝对的蓝领");
        zhangsan.setName("张三");
        zhangsan.setSalary(1800);
        zhangsan.setSex(Employee.MALE);
        employees.add(zhangsan);

        CommonEmployee lisi = new CommonEmployee();
        lisi.setJob("美工");
        lisi.setName("李四");
        lisi.setSalary(1900);
        lisi.setSex(Employee.FEMALE);
        employees.add(lisi);

        Manager wangwu = new Manager();
        wangwu.setPerformance("基本上是负值，但是会拍马屁啊...");
        wangwu.setName("王五");
        wangwu.setSalary(18750);
        wangwu.setSex(Employee.MALE);
        employees.add(wangwu);

        return employees;
    }
}
