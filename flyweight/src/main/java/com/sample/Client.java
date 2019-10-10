package com.sample;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-09 23:06
 */
public class Client {
    public static void main(String[] args) {
        // 从工厂中获得一个对象
        SignInfo signInfo = SignInfoFactory.getSignInfo();

        // 进行其他业务处理

    }
}
