package com.state;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-08 23:50
 */
public class Lift implements ILift {

    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        // 电梯在什么状态下才能开启
        switch (this.state) {
            // 开门状态
            case OPENING_STATE:
                break;

            // 电梯是关门状态，可以开启
            case CLOSING_STATE:
                this.openWithoutLogic();
                this.setState(OPENING_STATE);
                break;

            // 电梯是运行状态，门本来就是关闭的，什么也不做
            case RUNNING_STATE:
                // do nothing
                break;

            // 电梯是停止状态，门本来就是关闭的，什么也不做
            case STOPPING_STATE:
                this.openWithoutLogic();
                this.setState(OPENING_STATE);
                break;
        }
    }

    @Override
    public void close() {
        // 电梯在什么状态下才能关闭
        switch (this.state) {
            // 可以关闭，同时修改电梯状态
            case OPENING_STATE:
                this.closeWithoutLogic();
                this.setState(CLOSING_STATE);
                break;

            // 电梯是关门状态，什么也不做
            case CLOSING_STATE:
                // do nothing
                break;

            // 电梯是运行状态，门本来就是关闭的，什么也不做
            case RUNNING_STATE:
                // do nothing
                break;

            // 电梯是停止状态，门本来就是关闭的，什么也不做
            case STOPPING_STATE:
                // do nothing
                break;
        }
    }

    @Override
    public void run() {
        // 电梯在什么状态下才能运行
        switch (this.state) {
            // 开门状态，什么都不做
            case OPENING_STATE:
                break;

            // 电梯是关门状态，什么也不做
            case CLOSING_STATE:
                this.runWithoutLogic();
                this.setState(RUNNING_STATE);
                break;

            // 电梯是运行状态，门本来就是关闭的，什么也不做
            case RUNNING_STATE:
                // do nothing
                break;

            // 电梯是停止状态，门本来就是关闭的，什么也不做
            case STOPPING_STATE:
                this.runWithoutLogic();
                this.setState(RUNNING_STATE);
                break;
        }
    }

    @Override
    public void stop() {
        // 电梯在什么状态下才能停止
        switch (this.state) {
            // 开门状态，什么都不做
            case OPENING_STATE:
                break;

            // 电梯是关门状态，什么也不做
            case CLOSING_STATE:
                this.stopWithoutLogic();
                this.setState(CLOSING_STATE);
                break;

            // 电梯是运行状态，门本来就是关闭的，什么也不做
            case RUNNING_STATE:
                this.stopWithoutLogic();
                this.setState(CLOSING_STATE);
                break;

            // 电梯是停止状态，门本来就是关闭的，什么也不做
            case STOPPING_STATE:
                break;
        }
    }

    /**
     * 纯粹的电梯关门，不考虑实际的逻辑
     */
    private void closeWithoutLogic() {
        System.out.println("电梯门关闭...");
    }

    /**
     * 纯粹的电梯开门，不考虑实际的逻辑
     */
    private void openWithoutLogic() {
        System.out.println("电梯门开启...");
    }

    /**
     * 纯粹的电梯运行，不考虑实际的逻辑
     */
    private void runWithoutLogic() {
        System.out.println("电梯上下运行...");
    }

    /**
     * 单纯的停止，不考虑实际的逻辑
     */
    private void stopWithoutLogic() {
        System.out.println("电梯停止了...");
    }
}
