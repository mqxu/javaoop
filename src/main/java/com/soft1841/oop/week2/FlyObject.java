package com.soft1841.oop.week2;

/**
 * 飞行物抽象类，实现了Fly接口
 *  抽象类中可以有属性变量
 */
public abstract class FlyObject implements Fly {
    //飞行物名称
    protected String name;
    //飞行时速
    protected double speed;

    //构造方法，给飞行物的两个属性初始化
    public FlyObject(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }
}
