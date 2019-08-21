package com.dynamic.proxy;

import java.lang.reflect.Proxy;

/**
 * 测试动态代理
 */
public class TestDynamicProxy2 {
    public static void main(String[] args) {
        Hello hello = new HelloImpl();

        DynamicProxy2 dynamicProxy2 = new DynamicProxy2(hello);

        Hello helloProxy = (Hello) Proxy.newProxyInstance(
                hello.getClass().getClassLoader(),
                hello.getClass().getInterfaces(),
                dynamicProxy2
        );

        helloProxy.say("xinput dynamic");
    }
}
