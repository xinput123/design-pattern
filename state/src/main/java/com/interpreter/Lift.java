package com.interpreter;

public class Lift implements ILift {
    @Override
    public void open() {
        System.out.println("电梯门开启...");
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭...");
    }

    @Override
    public void run() {
        System.out.println("电梯门能上能下...");
    }

    @Override
    public void stop() {
        System.out.println("电梯门停止...");
    }
}
