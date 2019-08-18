package com.builder2;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-08-19 00:35
 */
public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        // 1万辆A类型的轿车
        for (int i = 0; i < 10000; i++) {
            director.getABenzModel().run();
        }

        // 100万B类型车
        for (int i = 0; i < 1000000; i++) {
            director.getBBenzModel().run();
        }

        // 1000万C类型车
        for (int i = 0; i < 10000000; i++) {
            director.getCBmwModel().run();
        }
    }
}
