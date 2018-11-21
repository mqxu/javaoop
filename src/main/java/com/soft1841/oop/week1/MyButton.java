package com.soft1841.oop.week1;

import javafx.scene.control.Button;

/**
 * 自定义按钮
 */
public class MyButton extends Button {
    //自定义构造方法，实现一个指定宽和高和背景色的按钮
    public MyButton(){
        //给当前按钮对象设置合适的尺寸
       this.setPrefSize(100,35);
       //给当前按钮设置背景色
       this.setStyle("-fx-background-color: rgb(19, 209, 190);-fx-font-size: 14px;-fx-text-fill: #FFFFFF");
    }
}
