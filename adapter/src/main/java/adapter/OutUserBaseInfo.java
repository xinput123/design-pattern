package adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-04 22:16
 */
public class OutUserBaseInfo implements IOuterUserBaseInfo {
    @Override
    public Map getUserBaseInfo() {
        HashMap baserInfoMap = new HashMap();
        baserInfoMap.put("userName", "这个员工叫混世魔王...");
        baserInfoMap.put("mobileNumber", "这个员工电话是...");
        return baserInfoMap;
    }
}
