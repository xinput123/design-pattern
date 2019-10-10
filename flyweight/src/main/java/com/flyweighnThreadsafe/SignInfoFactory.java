package com.flyweighnThreadsafe;

import java.util.HashMap;

/**
 * 带对象池的工厂类
 */
public class SignInfoFactory {

    private static HashMap<String, SignInfo> pool = new HashMap<>();

    @Deprecated
    public static SignInfo getSignInfo() {
        return new SignInfo();
    }

    /**
     * 从池中获得对象
     */
    public static SignInfo getSignInf(String key) {
        // 设置返回对象
        SignInfo result = null;

        // 池中没有该对象，则建立，并放入池中
        if (!pool.containsKey(key)) {
            result = new SignInfo();
            pool.put(key, result);
        } else {
            result = pool.get(key);
        }

        return result;
    }
}
