package com.soft1841.oop.week1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class ButtonController implements Initializable {
    @FXML
    private HBox hBox;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Button myButton = new Button("圆角按钮");
        myButton.getStyleClass().add("border-button");
        myButton.setGraphic(new ImageView(new Image("/img/pen.png")));
        hBox.getChildren().add(myButton);
//        Button button = new Button();
//        ControlStyle greenNormalStyle = new ControlStyle(
//                new Dimension(120,40),14,
//                Color.rgb(66, 192, 46),
//                Color.rgb(255, 255, 255),
//                100);
//        StyleUtil.setStyle(button,greenNormalStyle);
//        hBox.getChildren().add(button);
    }
}
