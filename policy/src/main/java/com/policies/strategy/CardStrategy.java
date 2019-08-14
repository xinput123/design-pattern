package com.policies.strategy;

import com.policies.RechargeTypeEnum;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-05-09 15:41
 */
public class CardStrategy implements Strategy {
    @Override
    public Double calRecharge(Double charge, RechargeTypeEnum type) {
        return charge + charge * 0.01;
    }
}
