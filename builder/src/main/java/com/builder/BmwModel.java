package com.builder;

/**
 * 宝马车模型代码
 */
public class BmwModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("宝马车启动了...");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车停车了...");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马车按喇叭了...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马车引擎的声音...");
    }
}
