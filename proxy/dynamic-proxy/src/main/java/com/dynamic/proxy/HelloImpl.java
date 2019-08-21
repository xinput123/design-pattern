package com.dynamic.proxy;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-08-21 10:43
 */
public class HelloImpl implements Hello {
    @Override
    public void say(String name) {
        System.out.println("Hi, " + name);
    }
}
