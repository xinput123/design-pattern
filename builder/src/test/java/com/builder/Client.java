package com.builder;

import java.util.ArrayList;

/**
 * 修改后
 */
public class Client {

    public static void main(String[] args) {
        // 设置模型的启动顺序
        ArrayList<String> sequence = new ArrayList();
        sequence.add("engin boom");
        sequence.add("start");
        sequence.add("stop");

        // 构建奔驰车构建者
        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);

        // 制造出一个奔驰车
        BenzModel benzModel = (BenzModel) benzBuilder.getCarModel();
        benzModel.run();

        // 同样的顺序，要一个宝马车
        BmwBuilder bmwBuilder = new BmwBuilder();
        bmwBuilder.setSequence(sequence);

        BmwModel bmwModel = (BmwModel) bmwBuilder.getCarModel();
        bmwModel.run();

    }
}
