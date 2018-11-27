package com.soft1841.oop.week1;

import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.paint.Color;

/**
 * 样式设置工具类
 */
public class StyleUtil{
    public static void setStyle(Control control,ControlStyle style){
        //给当前组件对象设置参数指定的尺寸
        control.setPrefSize(style.getSize().width,style.getSize().height);
        //给当前组件设置指定的背景色
        control.setStyle("-fx-background-color: " + style.getBgColor());
        //给当前组件设置字体颜色
        control.setStyle("-fx-text-fill: " + style.getForeColor());
        //设置组件字体大小
        control.setStyle("-fx-font-size: " + style.getSize());
        //设置圆角效果
        control.setStyle("-fx-border-radius:"+style.getRadius());
        control.setStyle("-fx-background-radius:"+style.getRadius());
    }
}
