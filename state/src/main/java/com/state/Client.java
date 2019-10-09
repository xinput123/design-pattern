package com.state;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-09 00:00
 */
public class Client {
    public static void main(String[] args) {
        ILift lift = new Lift();
        // 电梯的初始条件应该是停止状态
        lift.setState(ILift.STOPPING_STATE);

        lift.open();

        lift.close();

        lift.run();

        lift.stop();
    }
}
