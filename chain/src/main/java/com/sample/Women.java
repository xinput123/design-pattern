package com.sample;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-03 23:50
 */
public class Women implements IWomen {

    /**
     * 通过一个int类型的参数来描述妇女的个人状况
     * 1 - 未出嫁
     * 2 - 出嫁
     * 3 - 夫死
     */
    private int type = 0;

    private String request = "";

    public Women(int type, String request) {
        this.type = type;
        this.request = request;
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
