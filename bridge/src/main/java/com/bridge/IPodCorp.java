package com.bridge;

/**
 * iPod山寨公司
 */
public class IPodCorp extends Corp {

    @Override
    protected void produce() {
        System.out.println("我生产iPod...");
    }

    @Override
    protected void sell() {
        System.out.println("iPod畅销...");
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("我赚钱啊...");
    }
}
