package com.facade;

/**
 * 现代化邮局
 */
public class ModenPostOffice {

    private ILetterProcess letterProcess = new LetterProcessImpl();

    private Police police = new Police();

    public void sendLetter(String context, String address) {
        // 帮你写信
        letterProcess.writeContext("Hello");

        // 帮你写信封
        letterProcess.fillEnvelope("北京南大街66号");

        // 检查信件
        police.checkLetter(letterProcess);

        // 帮你把信放到信封中
        letterProcess.letterIntoEnvelope();

        // 帮你投递
        letterProcess.sendLetter();
    }
}
