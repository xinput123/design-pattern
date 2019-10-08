package com.facade;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-08 14:17
 */
public class Client {

    public static void main(String[] args) {
        ModenPostOffice modenPostOffice = new ModenPostOffice();

        String address = "北京市东大路88号";

        String context = "hello。。。";

        modenPostOffice.sendLetter(context, address);
    }
}
