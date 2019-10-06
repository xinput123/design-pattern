package com.composite3;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-06 12:20
 */
public class Client {

    /**
     * 通过递归遍历树
     */
    public static void display(Component root) {
        for (Component c : root.getChildren()) {
            if (c instanceof Leaf) {
                //叶子节点
                c.doSomething();
            } else { //树枝节点
                display(c);
            }
        }
    }
}
