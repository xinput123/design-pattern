package com;

import com.policies.RechargeTypeEnum;

/**
 * 作为一个新手的代码基本如下：
 *
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-05-09 15:30
 */
public class Example01 {
    public Double calRecharge(Double charge, RechargeTypeEnum type) {

        if (type.equals(RechargeTypeEnum.E_BANK)) {
            return charge * 0.85;
        } else if (type.equals(RechargeTypeEnum.BUSI_ACCOUNTS)) {
            return charge * 0.90;
        } else if (type.equals(RechargeTypeEnum.MOBILE)) {
            return charge;
        } else if (type.equals(RechargeTypeEnum.CARD_RECHARGE)) {
            return charge + charge * 0.01;
        } else {
            return null;
        }
    }
}
