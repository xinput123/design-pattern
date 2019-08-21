package com.cglib.proxy;

/**
 * 重构 TestCglibProxy1
 */
public class TestCglibProxy2 {
    public static void main(String[] args) {
        HelloCglib helloCglib = CglibProxy2.getInstance().getProxy(HelloCglib.class);
        helloCglib.say("xinput");
    }
}
