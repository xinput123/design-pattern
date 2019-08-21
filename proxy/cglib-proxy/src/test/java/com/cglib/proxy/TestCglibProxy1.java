package com.cglib.proxy;

public class TestCglibProxy1 {

    public static void main(String[] args) {
        CglibProxy1 cglibProxy1 = new CglibProxy1();
        HelloCglib helloCglib = cglibProxy1.getProxy(HelloCglib.class);
        helloCglib.say("xinput");
    }

}
