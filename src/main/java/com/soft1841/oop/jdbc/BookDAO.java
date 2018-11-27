package com.soft1841.oop.jdbc;

import cn.hutool.db.Entity;

import java.sql.SQLException;
import java.util.List;

public interface BookDAO {
    int insert(Book book) throws SQLException;

    int delete(int id)throws SQLException;

    int update(Book book) throws SQLException;

    List<Entity> getAllBooks() throws SQLException;

    Entity get(int id)throws SQLException;

}
