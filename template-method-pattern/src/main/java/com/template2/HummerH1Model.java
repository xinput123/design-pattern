package com.template2;

/**
 * 扩展后的H1悍马
 */
public class HummerH1Model extends HummerModel {

    private boolean alarmFlag = true;

    @Override
    protected void start() {
        System.out.println("扩展后的悍马H1发动...");
    }

    @Override
    protected void stop() {
        System.out.println("扩展后的悍马H1停车...");
    }

    @Override
    protected void alarm() {
        System.out.println("扩展后的悍马H1鸣笛...");
    }

    @Override
    protected void enginBoom() {
        System.out.println("扩展后的悍马H1发出的引擎音...");
    }

    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    public void setAlarm(boolean isAlarm) {
        this.alarmFlag = isAlarm;
    }
}
