package com.simple;

import java.util.ArrayList;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-08-18 23:54
 */
public class Client {

    public static void main(String[] args) {
        ArrayList<String> sequence = new ArrayList();
        sequence.add("engin boom");
        sequence.add("start");
        sequence.add("stop");

        BenzModel benzModel = new BenzModel();
        benzModel.setSequence(sequence);
        benzModel.run();
    }
}
