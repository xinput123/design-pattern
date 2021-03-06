package com.policies;

import com.policies.util.Context;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-05-09 16:03
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        // 网银充值100 需要付多少
        Double money = context.calRecharge(100D, RechargeTypeEnum.E_BANK.value());
        System.out.println(money);

        // 商户账户充值100 需要付多少
        Double money2 = context.calRecharge(100D, RechargeTypeEnum.BUSI_ACCOUNTS.value());
        System.out.println(money2);

        // 手机充值100 需要付多少
        Double money3 = context.calRecharge(100D, RechargeTypeEnum.MOBILE.value());
        System.out.println(money3);

        // 充值卡充值100 需要付多少
        Double money4 = context.calRecharge(100D, RechargeTypeEnum.CARD_RECHARGE.value());
        System.out.println(money4);
    }
}
