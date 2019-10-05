package adapter;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-05 16:58
 */
public class Client {

    public static void main(String[] args) {
        // 外部系统的人员信息
        IOuterUserBaseInfo baseInfo = new OutUserBaseInfo();
        IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
        IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();

        // 传递三个对象
        IUserInfo youngGril = new OuterUserInfo(baseInfo, homeInfo, officeInfo);

        // 从数据库中查到101个
        for (int i = 0; i < 101; i++) {
            youngGril.getMobileNumber();
        }
    }
}
