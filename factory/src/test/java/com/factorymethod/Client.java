package com.factorymethod;

/**
 * 场景类，负责模拟这个女娲造人的场景
 */
public class Client {

    public static void main(String[] args) {
        // 声明一个工厂类
        AbstractHumanFactory humanFactory = new HumanFactory();

        // 创建白种人
        Human whiteHuman = humanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        // 创建黑种人
        Human blackHuman = humanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        // 创建黄种人
        Human yelloHuman = humanFactory.createHuman(YelloHuman.class);
        yelloHuman.getColor();
        yelloHuman.talk();
    }
}
