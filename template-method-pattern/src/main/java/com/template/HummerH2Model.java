package com.template;

/**
 * H2 型悍马模型
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
}
