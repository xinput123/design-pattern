package com.policies.util;

import com.policies.RechargeTypeEnum;
import com.policies.strategy.*;

import java.util.HashMap;
import java.util.Map;

/**
 * StrategyFactory工厂,负责Strategy实例的创建：
 *
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-05-09 15:44
 */
public class StrategyFactory {
    private static StrategyFactory factory = new StrategyFactory();

    private StrategyFactory() {
    }

    private static Map<Integer, Strategy> strategyMap = new HashMap<>();

    static {
        strategyMap.put(RechargeTypeEnum.E_BANK.value(), new EBankStrategy());
        strategyMap.put(RechargeTypeEnum.BUSI_ACCOUNTS.value(), new BusiAcctStrategy());
        strategyMap.put(RechargeTypeEnum.MOBILE.value(), new MobileStrategy());
        strategyMap.put(RechargeTypeEnum.CARD_RECHARGE.value(), new CardStrategy());
    }

    public Strategy creator(Integer type) {
        return strategyMap.get(type);
    }

    public static StrategyFactory getInstance() {
        return factory;
    }
}
