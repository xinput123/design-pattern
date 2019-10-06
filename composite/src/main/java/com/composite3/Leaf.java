package com.composite3;

import java.util.ArrayList;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-06 12:19
 */
public class Leaf extends Component {
    @Override
    @Deprecated
    public void add(Component component) throws UnsupportedOperationException {
        //空实现,直接抛弃一个"不支持请求"异常
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public void remove(Component component) throws UnsupportedOperationException {
        //空实现
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public ArrayList<Component> getChildren() throws UnsupportedOperationException {
        //空实现
        throw new UnsupportedOperationException();
    }
}
