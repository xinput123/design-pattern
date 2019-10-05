package adapter;

import java.util.Map;

/**
 * 适配器
 */
public class OuterUserInfo implements IUserInfo {

    // 源目标对象
    /**
     * 员工的基本信息
     */
    private IOuterUserBaseInfo baseInfo = null;

    /**
     * 员工的家庭信息
     */
    private IOuterUserHomeInfo homeInfo = null;

    /**
     * 员工的工作信息
     */
    private IOuterUserOfficeInfo officeInfo = null;

    // 数据处理
    private Map baseMap = null;
    private Map homeMap = null;
    private Map officeMap = null;

    public OuterUserInfo(IOuterUserBaseInfo baseInfo, IOuterUserHomeInfo homeInfo, IOuterUserOfficeInfo officeInfo) {
        this.baseInfo = baseInfo;
        this.homeInfo = homeInfo;
        this.officeInfo = officeInfo;

        // 数据处理
        this.baseMap = this.baseInfo.getUserBaseInfo();
        this.homeMap = this.homeInfo.getUserHomeInfo();
        this.officeMap = this.officeInfo.getUserOfficeInfo();
    }

    @Override
    public String getUserName() {
        String userName = (String) this.baseMap.get("userName");
        System.out.println(userName);
        return userName;
    }

    @Override
    public String getHomeAddress() {
        String homeAddress = (String) this.homeMap.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    @Override
    public String getMobileNumber() {
        String mobileNumber = (String) this.baseMap.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    @Override
    public String getOfficeTelNumber() {
        String officeTelNumber = (String) this.officeMap.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }

    @Override
    public String getJobPosition() {
        String jobPosition = (String) this.officeMap.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    @Override
    public String getHomeTelNumber() {
        String homeTelNumber = (String) this.homeMap.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }
}
