package com.flyweighnThreadsafe;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-10 10:23
 */
public class Client {
    public static void main(String[] args) {
        // 在对象池中初始化4个对象
        SignInfoFactory.getSignInf("科目1");
        SignInfoFactory.getSignInf("科目2");
        SignInfoFactory.getSignInf("科目3");
        SignInfoFactory.getSignInf("科目4");

        // 取得对象
        SignInfo signInfo = SignInfoFactory.getSignInf("科目1");

        while (true) {
            signInfo.setId("ZhangSan");
            signInfo.setLocation("ZhangSan");
            new MultiThread(signInfo).start();

            signInfo.setId("LiSi");
            signInfo.setLocation("LiSi");
            new MultiThread(signInfo).start();
        }
    }
}
