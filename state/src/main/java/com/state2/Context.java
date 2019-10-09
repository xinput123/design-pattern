package com.state2;

/**
 * 上下文类
 */
public class Context {

    /*定义电梯的所有状态*/

    public final static OpenningState openningState = new OpenningState();

    public final static CloseingState closeingState = new CloseingState();

    public final static RunningState runningState = new RunningState();

    public final static StoppingState stoppingState = new StoppingState();

    /**
     * 定义一个当前电梯的状态
     */
    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }
}
