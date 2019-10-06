package com.composite4;

import java.util.ArrayList;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-06 12:23
 */
public class Branch extends Corp {

    /**
     * 领导的跟班，下属
     */
    ArrayList<Corp> subordinateList = new ArrayList<>();

    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    /**
     * 增加一个下属，可能是小头目，也可能是小兵
     */
    public void addSubordinate(Corp corp) {
        // 设置父节点
        corp.setParent(this);
        this.subordinateList.add(corp);
    }

    public ArrayList<Corp> getSubordinateList() {
        return this.subordinateList;
    }
}
