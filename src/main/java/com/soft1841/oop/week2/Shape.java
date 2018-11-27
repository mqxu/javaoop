package com.soft1841.oop.week2;

/**
 * 父类Shape，抽象类
 */
public abstract class Shape {
    //声明两个受保护类型的属性x、y
    protected  double x;
    protected  double y;

    //无参构造器
    public Shape() {
    }

    //全参构造器,只做声明， 具体属性初始化到子类中做
    public Shape(double x, double y) {
    }

    //声明了一个抽象方法，抽象方法不能带方法体
    public abstract double getArea();

    public void demo(){

    }
}
