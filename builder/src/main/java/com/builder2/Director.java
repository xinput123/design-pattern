package com.builder2;

import com.builder.BenzBuilder;
import com.builder.BenzModel;
import com.builder.BmwBuilder;
import com.builder.BmwModel;

import java.util.ArrayList;

/**
 * 导演类
 */
public class Director {

    private ArrayList<String> sequence = new ArrayList();

    private BenzBuilder benzBuilder = new BenzBuilder();
    private BmwBuilder bmwBuilder = new BmwBuilder();

    public BenzModel getABenzModel() {
        // 清理场景
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    public BenzModel getBBenzModel() {
        // 清理场景
        this.sequence.clear();
        this.sequence.add("engin boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    public BmwModel getCBmwModel() {
        // 清理场景
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.bmwBuilder.setSequence(this.sequence);
        return (BmwModel) this.bmwBuilder.getCarModel();
    }

    public BmwModel getDBmwModel() {
        // 清理场景
        this.sequence.clear();
        this.sequence.add("start");
        this.bmwBuilder.setSequence(this.sequence);
        return (BmwModel) this.bmwBuilder.getCarModel();
    }

    // ...
    // this.sequence.clear();
    // 如果 ArrayList 和 HashMap 如果定义成类的成员变量，那么在方法中的调用一样要做一次
    // clear的动作，以防止数据混乱。
}
