package com.chain;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-04 11:04
 */
public class Son extends Handler {
    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("-----母亲向儿子请示----");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是:同意");
    }
}
