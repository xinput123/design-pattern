package com.template2;

/**
 * 扩展后的H2悍马
 */
public class HummerH2Model extends HummerModel {

    @Override
    protected void start() {
        System.out.println("扩展后的悍马H2发动...");
    }

    @Override
    protected void stop() {
        System.out.println("扩展后的悍马H2停车...");
    }

    @Override
    protected void alarm() {
        System.out.println("扩展后的悍马H2鸣笛...");
    }

    @Override
    protected void enginBoom() {
        System.out.println("扩展后的悍马H2发出的引擎音...");
    }

    @Override
    protected boolean isAlarm() {
        return false;
    }
}
