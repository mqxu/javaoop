package com.soft1841.oop.week1;

import javafx.scene.paint.Color;

import java.awt.*;

/**
 * 封装组件的样式类
 */
public class ControlStyle {
    //尺寸
    private Dimension size;
    //文字大小
    private int fontSize;
    //背景色
    private Color bgColor;
    //前景色（字体颜色）
    private Color foreColor;
    //圆角幅度
    private int radius;

    //无参构造方法
    public ControlStyle() {
    }

    //全参构造方法
    public ControlStyle(Dimension size,int fontSize, Color bgColor, Color foreColor, int radius) {
        this.size = size;
        this.fontSize = fontSize;
        this.bgColor = bgColor;
        this.foreColor = foreColor;
        this.radius = radius;
    }

    public Dimension getSize() {
        return size;
    }

    public void setSize(Dimension size) {
        this.size = size;
    }


    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public Color getBgColor() {
        return bgColor;
    }

    public void setBgColor(Color bgColor) {
        this.bgColor = bgColor;
    }

    public Color getForeColor() {
        return foreColor;
    }

    public void setForeColor(Color foreColor) {
        this.foreColor = foreColor;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "ControlStyle{" +
                "size=" + size +
                ", fontSize=" + fontSize +
                ", bgColor=" + bgColor +
                ", foreColor=" + foreColor +
                ", radius=" + radius +
                '}';
    }
}
