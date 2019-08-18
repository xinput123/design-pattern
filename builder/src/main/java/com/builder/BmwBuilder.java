package com.builder;

import java.util.ArrayList;

/**
 * 宝马车组装者
 */
public class BmwBuilder extends CarBuilder {

    private BmwModel bmw = new BmwModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return bmw;
    }
}
