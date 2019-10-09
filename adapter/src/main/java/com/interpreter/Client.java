package com.interpreter;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-04 20:42
 */
public class Client {
    public static void main(String[] args) {
        IUserInfo youngGirl = new UserInfo();
        for (int i = 0; i < 101; i++) {
            youngGirl.getMobileNumber();
        }

        youngGirl = new OuterUserInfo();
        for (int i = 0; i < 101; i++) {
            youngGirl.getMobileNumber();
        }
    }
}
