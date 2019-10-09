package com.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-04 20:08
 */
public class OuterUser implements IOuterUser {

    @Override
    public Map getUserBaseInfo() {
        HashMap baserInfoMap = new HashMap();
        baserInfoMap.put("userName", "这个员工叫混世魔王...");
        baserInfoMap.put("mobileNumber", "这个员工电话是...");
        return baserInfoMap;
    }

    @Override
    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("jobPosition", "这个人的职位是Boss...");
        officeInfo.put("officeTelNumber", "员工的办公电话是...");
        return officeInfo;
    }

    @Override
    public Map getUserHomeInfo() {
        HashMap homeInfo = new HashMap();
        homeInfo.put("homeTelNumber", "员工的家庭电话是...");
        homeInfo.put("homeAddress", "员工的家庭地址是...");
        return homeInfo;
    }
}
