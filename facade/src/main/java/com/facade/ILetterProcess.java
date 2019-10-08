package com.facade;

/**
 * 写信过程的接口
 */
public interface ILetterProcess {

    /**
     * 信的内容
     */
    void writeContext(String context);

    /**
     * 写信封
     */
    void fillEnvelope(String address);

    /**
     * 把信放到邮箱里
     */
    void letterIntoEnvelope();

    /**
     * 邮递
     */
    void sendLetter();
}
