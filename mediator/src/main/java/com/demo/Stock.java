package com.demo;

/**
 * 库存管理
 */
public class Stock {

    // 初始内存
    private static int COMPUTER_NUMBER = 100;

    // 增加库存
    public void increase(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
        System.out.println("库存数量 : " + COMPUTER_NUMBER);
    }

    // 减少库存
    public void decrease(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        System.out.println("库存数量 : " + COMPUTER_NUMBER);
    }

    // 获得库存数量
    public int getStockNumber() {
        return COMPUTER_NUMBER;
    }

    // 库存压力大，就要通知采购人员不要采购，销售人员尽快销售
    public void clearStock() {
        Purchase purchase = new Purchase();
        Sale sale = new Sale();
        System.out.println("清理存货数量为：" + COMPUTER_NUMBER);
        //要求折价销售
        sale.offSale();
        //要求采购人员不要采购
        purchase.refuseBuyIBM();
    }
}
