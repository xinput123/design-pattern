package com.flyweighn;

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
            System.out.println(key + "---建立对象，并放置到池中");
            result = new SignInfo4Pool(key);
        } else {
            result = pool.get(key);
            System.out.println(key + "--直接从池中取得");
        }

        return result;
    }
}
