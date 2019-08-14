package com.policies.strategy;

import com.policies.RechargeTypeEnum;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-05-09 15:39
 */
public class EBankStrategy implements Strategy {
    @Override
    public Double calRecharge(Double charge, RechargeTypeEnum type) {
        return charge * 0.85;
    }
}
