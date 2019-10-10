package com.bridge2;

/**
 * 房地产公司
 */
public class HourseCorp extends Corp {

    public HourseCorp(House house) {
        super(house);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司太赚钱了...");
    }
}
