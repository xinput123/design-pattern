package com.sample;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-08 22:54
 */
public class Manager extends Employee {

    private String performance;

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    @Override
    protected String getOtherInfo() {
        return "业绩: " + this.performance + "\t";
    }
}
