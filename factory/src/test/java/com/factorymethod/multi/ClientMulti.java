package com.factorymethod.multi;

/**
 * 多个工厂类测试方法
 */
public class ClientMulti {

    public static void main(String[] args) {
        // 创建白种人
        Human whiteHuman = new WhiteHumanFactory().createHuman();
        whiteHuman.getColor();
        whiteHuman.talk();

        // 创建黑种人
        Human blackHuman = new WhiteHumanFactory().createHuman();
        blackHuman.getColor();
        blackHuman.talk();

        // 创建黄种人
        Human yelloHuman = new WhiteHumanFactory().createHuman();
        yelloHuman.getColor();
        yelloHuman.talk();
    }
}
