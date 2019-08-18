package com.builder;

/**
 * 奔驰车模型代码
 */
public class BenzModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("奔驰车启动了...");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰车停车了...");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰车按喇叭了...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰车引擎的声音...");
    }
}
