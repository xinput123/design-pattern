package com.observer2;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-08 11:31
 */
public class WangSi implements Observer {

    /**
     * 王四
     */
    @Override
    public void update(String context) {
        System.out.println("王四:观察到韩非子有活动，开始向老板汇报");
        this.cry(context);
        System.out.println("王四:汇报完毕");
    }

    private void cry(String reortContext) {
        System.out.println("王四:报告，哭死了--->" + reortContext);
    }
}
