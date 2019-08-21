package com.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 重构
 * DynamicProxy实现了InvocationHandler接口，那么必须实现该接口的invoke方法
 */
public class DynamicProxy2 implements InvocationHandler {

    private Object target;

    public DynamicProxy2(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        befor();
        Object result = method.invoke(target, args);
        after();
        return result;
    }

    @SuppressWarnings("unchecked")
    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this
        );
    }

    private void befor() {
        System.out.println("before");
    }

    private void after() {
        System.out.println("after");
    }
}
