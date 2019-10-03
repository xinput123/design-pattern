package com.graphic;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-03 23:35
 */
public class Invoker {
    /**
     * 命令
     */
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 执行命令
     */
    public void action() {
        this.command.execute();
    }
}
