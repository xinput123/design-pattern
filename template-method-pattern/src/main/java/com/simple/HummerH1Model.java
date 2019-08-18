package com.simple;

/**
 * H1 型悍马模型
 */
public class HummerH1Model extends HummerModel {
    @Override
    public void start() {
        System.out.println("悍马H1发动...");
    }

    @Override
    public void stop() {
        System.out.println("悍马H1停车...");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    @Override
    public void enginBoom() {
        System.out.println("悍马H1发出的引擎音...");
    }

    @Override
    public void run() {
        this.start();
        this.enginBoom();
        this.alarm();
        this.stop();
    }
}
