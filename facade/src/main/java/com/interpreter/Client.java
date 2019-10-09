package com.interpreter;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-08 12:04
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个处理信件的过程
        ILetterProcess letterProcess = new LetterProcessImpl();

        // 开始写信
        letterProcess.writeContext("Hello");

        // 开始写信封
        letterProcess.fillEnvelope("北京南大街66号");

        // 把信放到信封中
        letterProcess.letterIntoEnvelope();

        // 跑到邮局把信塞到邮箱，投递
        letterProcess.sendLetter();
    }
}
