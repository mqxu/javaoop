package com.soft1841.oop.week1;

/**
 * 子类：矩形类
 * 继承自形状类
 * 重写父类的getArea()方法，求出矩形的面积
 */
public class Rectangle extends Shape {
    @Override
    public void getArea() {
        //super作用1：调用父类方法
        super.getArea();
        int width = 10;
        int height = 5;
        System.out.println(width*height);
    }
}
