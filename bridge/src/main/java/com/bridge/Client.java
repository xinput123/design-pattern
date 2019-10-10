package com.bridge;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-10 18:36
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("---房地产公司时这样运行的----");

        // 先找到我的公司
        HouseCorp houseCorp = new HouseCorp();
        // 看我怎么挣钱
        houseCorp.makeMoney();
        System.out.println("\n");

        System.out.println("---山寨公司是这样运行的---");
        IPodCorp iPodCorp = new IPodCorp();
        iPodCorp.makeMoney();

    }
}
