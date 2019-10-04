package com.chain;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-04 11:02
 */
public class Husband extends Handler {

    public Husband() {
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("-----妻子向丈夫请示----");
        System.out.println(women.getRequest());
        System.out.println("丈夫的答复是:同意");
    }
}
