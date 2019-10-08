package com.observer2;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-08 11:30
 */
public class Lisi implements Observer {

    /**
     * 首先，李斯是个观察者，一旦韩非子有活动，他就知道，他就要像老板汇报
     */
    @Override
    public void update(String context) {
        System.out.println("李斯:观察到韩非子有活动，开始向老板汇报");
        this.reportToQinShiHuang(context);
        System.out.println("李斯:汇报完毕");
    }

    private void reportToQinShiHuang(String reortContext) {
        System.out.println("李斯:报告，秦老板！韩非子有活了--->" + reortContext);
    }
}
