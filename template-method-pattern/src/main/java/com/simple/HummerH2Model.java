package com.simple;

/**
 * H2 型悍马模型
 * H2 和 H1 两个实现类的run方法完全相同
 */
public class HummerH2Model extends HummerModel {
    @Override
    public void start() {
        System.out.println("悍马H2发动...");
    }

    @Override
    public void stop() {
        System.out.println("悍马H2停车...");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H2鸣笛...");
    }

    @Override
    public void enginBoom() {
        System.out.println("悍马H2发出的引擎音...");
    }

    @Override
    public void run() {
        this.start();
        this.enginBoom();
        this.alarm();
        this.stop();
    }
}
