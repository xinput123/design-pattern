package com.flyweighnThreadsafe;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-10 10:19
 */
public class MultiThread extends Thread {

    private SignInfo signInfo;

    public MultiThread(SignInfo signInfo) {
        this.signInfo = signInfo;
    }

    @Override
    public void run() {
        if (!signInfo.getId().equalsIgnoreCase(signInfo.getLocation())) {
            System.out.println("编号:" + signInfo.getId());
            System.out.println("考试地点: " + signInfo.getLocation());
            System.out.println("线程不安全了!");
        }
    }
}
