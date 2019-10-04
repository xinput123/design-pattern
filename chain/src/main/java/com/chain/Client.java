package com.chain;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-04 11:54
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
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();

        // 设置请求顺序
        father.setNext(husband);
        husband.setNext(son);

        for (IWomen women : arrayList) {
            father.HandleMessage(women);
        }
    }
}
