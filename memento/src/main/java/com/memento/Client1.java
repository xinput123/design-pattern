package com.memento;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-08 22:07
 */
public class Client1 {
    public static void main(String[] args) {
        // 声明出主角
        Boy boy = new Boy();

        // 初始化当前状态
        boy.setState("心情很棒!");
        System.out.println("====男孩现在的状态====");
        System.out.println(boy.getState());

        // 需要记录下当前状态
        Memento memento = boy.createMemento();

        // 男孩去追女孩，状态改变
        boy.changeState();
        System.out.println("\n====男孩追女孩子后的状态====");
        System.out.println(boy.getState());

        // 追女孩失败，恢复原状
        boy.restoreMemento(memento);
        System.out.println("\n====男孩子恢复后的状态=====");
        System.out.println(boy.getState());
    }
}
