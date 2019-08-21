package com.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 重构
 * DynamicProxy实现了InvocationHandler接口，那么必须实现该接口的invoke方法
 */
public class DynamicProxy1 implements InvocationHandler {

    private Object target;

    public DynamicProxy1(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        befor();
        Object result = method.invoke(target, args);
        after();
        return result;
    }

    private void befor() {
        System.out.println("before");
    }

    private void after() {
        System.out.println("after");
    }
}
