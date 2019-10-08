package com.sample;

/**
 * 具体的被观察者
 */
public class HanFeiZi implements IHanFeiZi {

    /**
     * 韩非子是否在吃早饭，作为监控的判断标准
     */
    private boolean isHavingBreakFast = false;

    /**
     * 韩非子是否在娱乐
     */
    private boolean isHavingFun = false;

    @Override
    public void haveBreadfast() {
        System.out.println("韩非子：开始吃饭了...");
        isHavingBreakFast = true;
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子：开始娱乐了...");
        isHavingFun = true;
    }

    public boolean isHavingBreakFast() {
        return isHavingBreakFast;
    }

    public void setHavingBreakFast(boolean havingBreakFast) {
        isHavingBreakFast = havingBreakFast;
    }

    public boolean isHavingFun() {
        return isHavingFun;
    }

    public void setHavingFun(boolean havingFun) {
        isHavingFun = havingFun;
    }
}
