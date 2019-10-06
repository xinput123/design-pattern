package com.composite2;

import java.util.ArrayList;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-06 12:14
 */
public class Client {

    public static void main(String[] args) {
        Branch ceo = compositeCorpTree();
        // 打印ceo信息
        System.out.println(ceo.getInfo());
        // 打印所有员工信息
        System.out.println(getTreeInfo(ceo));
    }

    public static Branch compositeCorpTree() {
        // 首先由总经理CEO
        Branch root = new Branch("王大麻子", "总经理", 100000);

        // 产生三个部门经理，树枝节点
        Branch developDep = new Branch("刘大瘸子", "研发部门经理", 10000);
        Branch salesDep = new Branch("马二拐子", "销售部门经理", 20000);
        Branch financeDep = new Branch("赵三驼子", "财务部门经理", 30000);

        // 两个小组长
        Branch firstDevGrooup = new Branch("刘研一", "开发一组组长", 5000);
        Branch secondDevGrooup = new Branch("刘研二", "开发二组组长", 6000);

        // 小兵级别
        Leaf a = new Leaf("开发a", "开发人员a", 2000);
        Leaf b = new Leaf("开发b", "开发人员b", 2000);
        Leaf c = new Leaf("开发c", "开发人员c", 2000);
        Leaf d = new Leaf("开发d", "开发人员d", 2000);
        Leaf e = new Leaf("开发e", "开发人员e", 2000);
        Leaf f = new Leaf("开发f", "开发人员f", 2000);
        Leaf g = new Leaf("开发g", "开发人员g", 2000);
        Leaf h = new Leaf("销售h", "销售人员h", 5000);
        Leaf i = new Leaf("销售i", "销售人员i", 4000);
        Leaf j = new Leaf("财务j", "财务人员j", 5000);
        Leaf k = new Leaf("秘书k", "CEO秘书k", 8000);
        Leaf zhenglaoliu = new Leaf("郑老六", "研发副总", 20000);

        // 组装
        // 首先定义总经理下面有三个部门经理
        root.addSubordinate(developDep);
        root.addSubordinate(salesDep);
        root.addSubordinate(financeDep);

        // 总经理下面还有一个秘书
        root.addSubordinate(k);

        // 定义研发部门下的结构
        developDep.addSubordinate(firstDevGrooup);
        developDep.addSubordinate(secondDevGrooup);

        // 研发部门下还有一个副总
        developDep.addSubordinate(zhenglaoliu);

        // 开发组下面成员
        firstDevGrooup.addSubordinate(a);
        firstDevGrooup.addSubordinate(b);
        firstDevGrooup.addSubordinate(c);
        secondDevGrooup.addSubordinate(d);
        secondDevGrooup.addSubordinate(e);
        secondDevGrooup.addSubordinate(f);

        // 销售下
        salesDep.addSubordinate(h);
        salesDep.addSubordinate(i);

        // 财务
        financeDep.addSubordinate(j);

        return root;
    }

    /**
     * 遍历所有的树枝节点，打印出信息
     */
    public static String getTreeInfo(Branch root) {
        ArrayList<Corp> subordinateList = root.getSubordinateList();

        String info = "";

        for (Corp s : subordinateList) {
            if (s instanceof Leaf) {
                // 是叶子节点，也就是员工
                info = info + s.getInfo() + "\n";
            } else {
                info = info + s.getInfo() + "\n" + getTreeInfo((Branch) s);
            }
        }
        return info;
    }
}
