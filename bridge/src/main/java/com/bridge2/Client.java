package com.bridge2;

/**
 * @author <a href="mailto:xinput.xx@gmail.com">xinput</a>
 * @Date: 2019-10-10 18:49
 */
public class Client {
    public static void main(String[] args) {
        House house = new House();
        System.out.println("---房地产公司是这样运行的----");

        HourseCorp hourseCorp = new HourseCorp(house);
        hourseCorp.makeMoney();
        System.out.println("\n");

        System.out.println("----山寨公司是这样运行的----");
        ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new IPod());
        shanZhaiCorp.makeMoney();

    }
}
