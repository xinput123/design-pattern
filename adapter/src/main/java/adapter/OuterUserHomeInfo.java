package adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-04 22:17
 */
public class OuterUserHomeInfo implements IOuterUserHomeInfo {
    @Override
    public Map getUserHomeInfo() {
        HashMap homeInfo = new HashMap();
        homeInfo.put("homeTelNumber", "员工的家庭电话是...");
        homeInfo.put("homeAddress", "员工的家庭地址是...");
        return homeInfo;
    }
}
