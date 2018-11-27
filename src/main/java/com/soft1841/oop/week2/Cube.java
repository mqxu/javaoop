package com.soft1841.oop.week2;

/**
 * 立方体子类，继承Rectangle类，为最终类,不再被继承
 */
public final class Cube extends Rectangle {
    //声明一个私有属性，为立方体的高
    private double height;

    public Cube() {
    }

    public Cube(double x, double y, double height) {
        //调用父类构造方法，完成对底面矩形的长、宽的初始化
        super(x, y);
        //通过this关键字，完成当前立方体对象的高的初始化
        this.height = height;
    }

    //本类独有的成员方法，求体积
    public double getVolumn(){
        //调用父类的求面积方法，求出底面矩形面积，使用this.height访问当前立方体的高，最终求出立方体的体积
        return  super.getArea() * this.height;
    }
}
