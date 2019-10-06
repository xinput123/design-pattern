package com.sample;

import java.util.ArrayList;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-05 23:41
 */
public class Client {

    public static void main(String[] args) {
        // 首先产生一个根节点
        IRoot ceo = new Root("王大麻子", "总经理", 100000);

        // 产生三个部门经理，树枝节点
        IBranch developDep = new Branch("刘大瘸子", "研发部门经理", 10000);
        IBranch salesDep = new Branch("马二拐子", "销售部门经理", 20000);
        IBranch financeDep = new Branch("赵三驼子", "财务部门经理", 30000);

        // 两个小组长
        IBranch firstDevGrooup = new Branch("刘研一", "开发一组组长", 5000);
        IBranch secondDevGrooup = new Branch("刘研二", "开发二组组长", 6000);

        // 小兵级别
        ILeaf a = new Leaf("开发a", "开发人员a", 2000);
        ILeaf b = new Leaf("开发b", "开发人员b", 2000);
        ILeaf c = new Leaf("开发c", "开发人员c", 2000);
        ILeaf d = new Leaf("开发d", "开发人员d", 2000);
        ILeaf e = new Leaf("开发e", "开发人员e", 2000);
        ILeaf f = new Leaf("开发f", "开发人员f", 2000);
        ILeaf g = new Leaf("开发g", "开发人员g", 2000);
        ILeaf h = new Leaf("销售h", "销售人员h", 5000);
        ILeaf i = new Leaf("销售i", "销售人员i", 4000);
        ILeaf j = new Leaf("财务j", "财务人员j", 5000);
        ILeaf k = new Leaf("秘书k", "CEO秘书k", 8000);
        ILeaf zhenglaoliu = new Leaf("郑老六", "研发副总", 20000);

        // 组装
        // 首先定义总经理下面有三个部门经理
        ceo.add(developDep);
        ceo.add(salesDep);
        ceo.add(financeDep);

        // 总经理下面还有一个秘书
        ceo.add(k);

        // 定义研发部门下的结构
        developDep.add(firstDevGrooup);
        developDep.add(secondDevGrooup);

        // 研发部门下还有一个副总
        developDep.add(zhenglaoliu);

        // 开发组下面成员
        firstDevGrooup.add(a);
        firstDevGrooup.add(b);
        firstDevGrooup.add(c);
        secondDevGrooup.add(d);
        secondDevGrooup.add(e);
        secondDevGrooup.add(f);

        // 销售下
        salesDep.add(h);
        salesDep.add(i);

        // 财务
        financeDep.add(j);

        // 打印写完的树状结构
        System.out.println(ceo.getInfo());

        getAllSubordinateInfo(ceo.getSibordinateInfo());
    }

    /**
     * 遍历所有的树枝节点，打印出信息
     */
    private static void getAllSubordinateInfo(ArrayList subordinateList) {
        int length = subordinateList.size();

        for (int i = 0; i < length; i++) {
            Object s = subordinateList.get(i);
            if (s instanceof Leaf) {
                // 是叶子节点，也就是员工
                ILeaf employee = (ILeaf) s;
                System.out.println(employee.getInfo());
            } else {
                IBranch branch = (IBranch) s;
                System.out.println(branch.getInfo());
                // 在递归调用
                getAllSubordinateInfo(branch.getSubordinateInfo());
            }
        }
    }
}
