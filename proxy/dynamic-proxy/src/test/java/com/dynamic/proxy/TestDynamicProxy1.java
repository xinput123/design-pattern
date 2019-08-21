package com.dynamic.proxy;

import java.lang.reflect.Proxy;

/**
 * 测试动态代理
 */
public class TestDynamicProxy1 {
    public static void main(String[] args) {
        Hello hello = new HelloImpl();
        DynamicProxy1 dynamicProxy = new DynamicProxy1(hello);

        // 这一段代码 见 DynamicProxy2 中优化
        Hello helloProxy = (Hello) Proxy.newProxyInstance(
                hello.getClass().getClassLoader(),
                hello.getClass().getInterfaces(),
                dynamicProxy
        );

        helloProxy.say("1234");
    }
}
