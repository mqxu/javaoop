package com.soft1841.oop.week2;

/**
 * 飞行接口
 * 接口中所有的方法都是公有的，抽象的
 * 接口中不能定义属性
 */
public interface Fly {
    /**
     * 省略了public和abstract修饰符的fly方法，返回飞行信息字符串
     * @return String
     */
    String fly();
}
