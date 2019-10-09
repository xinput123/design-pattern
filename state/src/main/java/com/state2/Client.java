package com.state2;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-09 14:08
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new CloseingState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
