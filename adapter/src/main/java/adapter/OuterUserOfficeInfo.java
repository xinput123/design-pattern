package adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-04 22:18
 */
public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {
    @Override
    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("jobPosition", "这个人的职位是Boss...");
        officeInfo.put("officeTelNumber", "员工的办公电话是...");
        return officeInfo;
    }
}
