package com.abstractfactory;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        // 第一条生产线，男性生产线
        HumanFactory maleHumanFactory = new MaleFactory();

        // 第二条生产线，女性生产线
        HumanFactory femaleHumanFactory = new FemaleFactory();

        System.out.println("生产男性黄种人.......开始");
        Human yellowMaleHuman = maleHumanFactory.createYelloHuman();
        yellowMaleHuman.getSex();
        yellowMaleHuman.getColor();
        yellowMaleHuman.talk();
        System.out.println("生产男性黄种人.......结束\n");

        System.out.println("生产男性黑种人.......开始");
        Human blackMaleHuman = maleHumanFactory.createBlackHuman();
        blackMaleHuman.getSex();
        blackMaleHuman.getColor();
        blackMaleHuman.talk();
        System.out.println("生产男性黑种人.......结束\n");

        System.out.println("生产男性白种人.......开始");
        Human whiteMaleHuman = maleHumanFactory.createWhiteHuman();
        whiteMaleHuman.getSex();
        whiteMaleHuman.getColor();
        whiteMaleHuman.talk();
        System.out.println("生产男性白种人.......结束\n");

        System.out.println("生产女性黄种人.......开始");
        Human yellowFemaleHuman = femaleHumanFactory.createYelloHuman();
        yellowFemaleHuman.getSex();
        yellowFemaleHuman.getColor();
        yellowFemaleHuman.talk();
        System.out.println("生产女性黄种人.......结束\n");

        System.out.println("生产女性黑种人.......开始");
        Human blackFeMaleHuman = femaleHumanFactory.createBlackHuman();
        blackFeMaleHuman.getSex();
        blackFeMaleHuman.getColor();
        blackFeMaleHuman.talk();
        System.out.println("生产女性黑种人.......结束\n");

        System.out.println("生产女性白种人.......开始");
        Human whiteFemaleHuman = femaleHumanFactory.createWhiteHuman();
        whiteFemaleHuman.getSex();
        whiteFemaleHuman.getColor();
        whiteFemaleHuman.talk();
        System.out.println("生产女性白种人.......结束\n");
    }
}
