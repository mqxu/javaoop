package com.soft1841.oop.jdbc;

import cn.hutool.db.Entity;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

public class BookDAOTest {
    private BookDAO bookDAO = new BookDAOImpl();

    @Test
    public void getAllBooks() throws SQLException {
        List<Entity> list = bookDAO.getAllBooks();
        list.forEach(entity -> System.out.println(entity.get("name") + "," + entity.get("price")));
    }

    @Test
    public void insert() throws SQLException {
        Book book = new Book("JavaScript", 45.4);
        int n = bookDAO.insert(book);
        assertEquals(1, n);
    }

    @Test
    public void delete() throws SQLException {
        int n = bookDAO.delete(7);
        assertEquals(1, n);
    }

    @Test
    public void get() throws SQLException {
        Entity entity = bookDAO.get(1);
        System.out.println(entity.get("name"));
    }

    @Test
    public void update() throws SQLException {
        Book book = new Book();
        book.setId(1);
        book.setPrice(188.9);
        int n = bookDAO.update(book);
        assertEquals(1, n);
    }
}