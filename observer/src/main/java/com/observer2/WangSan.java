package com.observer2;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-08 11:32
 */
public class WangSan implements Observer {

    @Override
    public void update(String context) {
        System.out.println("王三:观察到韩非子有活动，开始向老板汇报");
        this.reportToQinShiHuang(context);
        System.out.println("王三:汇报完毕");
    }

    private void reportToQinShiHuang(String reortContext) {
        System.out.println("王三:报告，老板！韩非子有活了--->" + reortContext);
    }
}
