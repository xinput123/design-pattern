package com;

import com.policies.RechargeTypeEnum;

/**
 * switch-case实现，其实和 if else是一个道理
 *
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-05-09 15:32
 */
public class Example02 {
    public Double calRecharge(Double charge, RechargeTypeEnum type) {
        switch (type) {
            case E_BANK:
                return charge * 0.85;
            case BUSI_ACCOUNTS:
                return charge * 0.90;
            case MOBILE:
                return charge;
            case CARD_RECHARGE:
                return (charge + charge * 0.01);
            default:
                return null;
        }
    }
}
