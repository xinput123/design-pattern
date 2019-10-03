package com.graphic;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-03 23:36
 */
public class Client {
    public static void main(String[] args) {
        // 定义接头人
        Invoker xiaoSan = new Invoker();

        System.out.println("------客户要求增加一项需求-----");

        Command command = new AddRequirementCommand();
        // 收到命令
        xiaoSan.setCommand(command);
        xiaoSan.action();

        System.out.println("------客户要求删除一个页面-----");
        command = new DeletePageCommand();
        xiaoSan.setCommand(command);
        xiaoSan.action();
    }


}
