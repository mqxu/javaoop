package com.soft1841.oop.jdbc;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class AddBookController {
    @FXML
    private TextField bookName, bookAuthor, bookPrice, bookCover;

    public void addBook() throws SQLException {
        //获取界面上组件的数据
        String name = bookName.getText();
        String author = bookAuthor.getText();
        String price = bookPrice.getText();
        String cover = bookCover.getText();
        //通过这些数据创建一个Book对象
        Book book = new Book(name, author, Double.parseDouble(price), cover);
        //创建Book的DAO对象，并调用新增图书方法
        BookDAO bookDAO = new BookDAOImpl();
        int n = bookDAO.insert(book);
        //创建一个对话框
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("提示信息");
        alert.setHeaderText("消息：");
        //根据新增成功或失败的结果，弹不同的提示信息
        if(n == 1){
            alert.setContentText("新增图书成功");
            alert.showAndWait();
        }else {
            alert.setContentText("新增图书失败");
            alert.showAndWait();
        }
    }
}
