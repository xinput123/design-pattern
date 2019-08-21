package com.prototype;

import java.util.Random;

/**
 * 修改后的场景类
 */
public class Client {

    private static int MAX_COUNT = 8;

    public static void main(String[] args) throws CloneNotSupportedException {
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("Xinput银行版权所有");
        while (i < MAX_COUNT) {
            Mail cloneMail = (Mail) mail.clone();
            // 以下是每封邮件不同的地方
            cloneMail.setAppellation(getRandString(5) + "先生/女士");
            cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");

            // 发送邮件
            sendMail(cloneMail);
            i++;
        }
    }

    public static void sendMail(Mail mail) {
        System.out.println("标题：" + mail.getSubject() + "\t收件人：" + mail.getReceiver() + "\t...发送成功！");
    }

    public static String getRandString(int maxLength) {
        String souce = "abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for (int i = 0; i < maxLength; i++) {
            sb.append(souce.charAt(rand.nextInt(souce.length())));
        }

        return sb.toString();
    }

}
