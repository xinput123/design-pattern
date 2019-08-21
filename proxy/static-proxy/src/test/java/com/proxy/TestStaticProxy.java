package com.proxy;

/**
 * 静态代理测试方法
 */
public class TestStaticProxy {
    public static void main(String[] args) {
        Hello hello = new HelloProxy();
        hello.say("xinput");
    }
}
