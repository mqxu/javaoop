package com.soft1841.oop.week1;

public class Student extends Human{
    @Override
    public void eat() {
        //调用父类的方法
        super.eat();
        System.out.println("学生在吃饭");
    }
}
