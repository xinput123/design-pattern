package com.interpreter;

/**
 * 员工信息接口
 */
public interface IUserInfo {

    /**
     * 获得用户姓名
     */
    String getUserName();

    /**
     * 获得家庭住址
     */
    String getHomeAddress();

    /**
     * 手机号码
     */
    String getMobileNumber();

    /**
     * 办公电话，一般是座机
     */
    String getOfficeTelNumber();

    /**
     * 职位
     */
    String getJobPosition();

    /**
     * 员工家庭电话
     */
    String getHomeTelNumber();
}
