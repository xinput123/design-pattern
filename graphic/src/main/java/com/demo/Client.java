package com.demo;

/**
 * 场景类
 */
public class Client {

    public static void main(String[] args) {
        // 客户找到需求组说，过来谈需求，并修改
        System.out.println("--------客户要求增加一项需求-----");
        Group gr = new RequirmentGroup();
        gr.find();
        gr.add();
        gr.plan();

        // 客户找到美工组说，过来谈需求，并修改
        System.out.println("--------客户要求删除一个页面-----");
        gr = new PageGroup();
        gr.find();
        gr.delete();
        gr.plan();
    }
}
