package com.interpreter;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-04 10:20
 */
public class Client {
    public static void main(String[] args) {
        // 随机挑选几个女性
        Random random = new Random();
        ArrayList<IWomen> arrayList = new ArrayList();

        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(random.nextInt(4), "我要出门"));
        }

        // 定义三个请示对象
        IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();

        for (IWomen women : arrayList) {
            // 未婚少女，请示父亲
            if (women.getType() == 1) {
                System.out.println("---女儿向父亲请示----");
                father.HandleMessage(women);
            } else if (women.getType() == 2) {
                // 已婚，向丈夫请示
                System.out.println("---妻子向丈夫请示----");
                husband.HandleMessage(women);
            } else if (women.getType() == 3) {
                // 已婚，向丈夫请示
                System.out.println("---母亲向儿子请示----");
                son.HandleMessage(women);
            } else {
                // 先不管
                System.out.println("----暂时什么都没有-----");
            }
        }
    }
}
