package com.sample;

import java.util.Random;

/**
 * 这个程序是单线程，有问题，如果真的是银行那种至少百万级别用户的，一个邮件0.02秒，
 * 这还不包括去数据库中查询数据，计算所耗费的时间，一天都发不完
 */
public class Client {

    private static int MAX_COUNT = 8;

    public static void main(String[] args) {
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("Xinput银行版权所有");
        while (i < MAX_COUNT) {
            // 以下是每封邮件不同的地方
            mail.setAppellation(getRandString(5) + "先生/女士");
            mail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");

            // 发送邮件
            sendMail(mail);
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
