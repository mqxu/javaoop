package com.soft1841.oop.jdbc;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class AddBookController {
    @FXML
    private TextField bookName, bookAuthor, bookPrice, bookCover;

    public void addBook() throws SQLException {
        String name = bookName.getText();
        String author = bookAuthor.getText();
        String price = bookPrice.getText();
        String cover = bookCover.getText();
        Book book = new Book(name, author, Double.parseDouble(price), cover);
        BookDAO bookDAO = new BookDAOImpl();
        int n = bookDAO.insert(book);
        //创建一个对话框
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("提示信息");
        alert.setHeaderText("消息：");
        if(n == 1){
            alert.setContentText("新增图书成功");
            alert.showAndWait();
        }else {
            alert.setContentText("新增图书失败");
            alert.showAndWait();
        }
    }
}
