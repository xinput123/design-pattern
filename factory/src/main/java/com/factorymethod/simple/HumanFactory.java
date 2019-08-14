package com.factorymethod.simple;

/**
 * 抽象类的实现类，完成具体的任务
 */
public class HumanFactory extends AbstractHumanFactory {

    @Override
    public <T extends Human> T createHuman(Class<T> cls) {
        // 定义一个生产的人种
        Human human = null;

        try {
            human = (T) Class.forName(cls.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) human;
    }
}
