package com.soft1841.oop.week2;

/**
 * 飞禽类，继承FlyObject抽象类
 */
public class Bird extends FlyObject {

    public Bird(String name, double speed) {
        //通过super调用父类构造方法
        super(name, speed);
    }

    @Override
    public String fly() {
        //重写fly抽象方法，返回飞禽的飞行信息
        return "飞禽名称：" + this.name + ",飞行时速：" + this.speed + "km/h";
    }
}
