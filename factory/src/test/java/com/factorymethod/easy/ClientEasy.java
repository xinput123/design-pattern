package com.factorymethod.easy;

/**
 * 简单工厂测试方法
 */
public class ClientEasy {

    public static void main(String[] args) {
        // 创建白种人
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        // 创建黑种人
        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        // 创建黄种人
        Human yelloHuman = HumanFactory.createHuman(YelloHuman.class);
        yelloHuman.getColor();
        yelloHuman.talk();
    }
}
