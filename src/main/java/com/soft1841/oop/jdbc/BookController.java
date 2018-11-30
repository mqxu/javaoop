package com.soft1841.oop.jdbc;

import cn.hutool.db.Entity;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class BookController implements Initializable {
    //注入布局文件中的流式布局对象
    @FXML
    private FlowPane bookPane;

    //Book的DAO对象，已经通过CRUD单元测试
    private BookDAO bookDAO = new BookDAOImpl();

    //定义一个集合对象
    private List<Entity> bookList = new ArrayList<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            //调用查询方法,得到结果
            bookList = bookDAO.getAllBooks();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //将bookList作为参数，调用显示所有图书的方法
        showBooks(bookList);
    }

    private void showBooks(List<Entity> bookList) {
        //遍历集合
        for (Entity entity : bookList) {
            //创建一个垂直布局用来显示每本图书信息
            VBox vBox = new VBox();
            //垂直布局元素间距
            vBox.setSpacing(10);
            //设置垂直布局的对其方式为居中对齐
            vBox.setAlignment(Pos.CENTER);
            //设置垂直布局的背景色和合适宽度
            vBox.setStyle("-fx-background-color: rgb(69, 163, 200);-fx-pref-width: 180px;");
            //设置垂直布局的内边距
            vBox.setPadding(new Insets(10, 10, 10, 10));
            //用来显示书名
            Label nameLabel = new Label(entity.getStr("name"));
            //用来显示作者信息
            Label authorLabel = new Label(entity.getStr("author"));
            //用来显示图书价格(注意将double数据转换成String才能在标签显示)
            Label priceLabel = new Label("价格:" + String.valueOf(entity.getDouble("price")));
            //用来显示图书封面
            ImageView bookImgView = new ImageView(new Image(entity.getStr("cover")));
            //设置图片大小
            bookImgView.setFitHeight(150);
            bookImgView.setFitWidth(120);
            //将所有组件加入垂直布局中
            vBox.getChildren().addAll(nameLabel, authorLabel, priceLabel, bookImgView);
            //将垂直布局加入主面板
            bookPane.getChildren().add(vBox);
        }
    }

    public void showAddBookStage() throws Exception {
        //创建一个新的舞台
        Stage addBookStage = new Stage();
        //读入add_book.fxml布局文件
        VBox root = new FXMLLoader(getClass().getResource("/fxml/add_book.fxml")).load();
        Scene scene = new Scene(root);
        addBookStage.setTitle("新增图书界面");
        addBookStage.setScene(scene);
        addBookStage.show();
    }

    public void reload(){
        //清空原数据
        ObservableList list = bookPane.getChildren();
        bookPane.getChildren().removeAll(list);
        try {
            bookList = bookDAO.getAllBooks();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        showBooks(bookList);
    }
}
