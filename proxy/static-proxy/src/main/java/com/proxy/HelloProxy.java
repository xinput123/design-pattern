package com.proxy;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-08-20 23:05
 */
public class HelloProxy implements Hello {

    private Hello hello;

    public HelloProxy() {
        this.hello = new HelloImpl();
    }

    @Override
    public void say(String name) {
        befor();
        hello.say("hello! " + name);
        after();
    }

    private void befor() {
        System.out.println("before");
    }

    private void after() {
        System.out.println("after");
    }
}
