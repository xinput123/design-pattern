package com.visitor2;

/**
 * 普通员工
 */
public class CommonEmployee extends Employee {

    /**
     * 工作内容
     */
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
