package com.memento2;

/**
 * 备忘录管理者
 */
public class Caretaker {

    /**
     * 发起人对象
     */
    private Originator originator;

    public Originator getOriginator() {
        return originator;
    }

    public void setOriginator(Originator originator) {
        this.originator = originator;
    }
}
