package com.sample;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-08 10:33
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
        // 定义出李斯和韩非子
        LiSi liSi = new LiSi();
        HanFeiZi hanFeiZi = new HanFeiZi();

        // 观察早饭
        Spy watchBreakfast = new Spy(hanFeiZi, liSi, "breakfast");
        watchBreakfast.start();

        // 观察早饭
        Spy watchFun = new Spy(hanFeiZi, liSi, "fun");
        watchFun.start();

        // 然后我们看韩非子在干什么
        Thread.sleep(1000);
        hanFeiZi.haveBreadfast();
        Thread.sleep(1000);
        hanFeiZi.haveFun();
    }
}
