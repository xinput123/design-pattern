package com.policies.strategy;

import com.policies.RechargeTypeEnum;

/**
 * 创建抽象策略角色Strategy：
 *
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-05-09 15:38
 */
public interface Strategy {

    /**
     * @param charge
     * @param type
     * @return
     */
    Double calRecharge(Double charge, RechargeTypeEnum type);
}
