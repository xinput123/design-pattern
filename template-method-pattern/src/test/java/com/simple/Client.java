package com.simple;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-08-18 17:51
 */
public class Client {
    public static void main(String[] args) {
        HummerH1Model h1Model = new HummerH1Model();
        h1Model.run();

        HummerH2Model h2Model = new HummerH2Model();
        h2Model.run();
    }
}
