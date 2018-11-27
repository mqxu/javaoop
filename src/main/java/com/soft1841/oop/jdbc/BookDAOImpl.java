package com.soft1841.oop.jdbc;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;

import java.sql.SQLException;
import java.util.List;

public class BookDAOImpl implements BookDAO {

    @Override
    public int insert(Book book) throws SQLException {
        return Db.use().insert(
                Entity.create("t_book")
                        .set("name", book.getName())
                        .set("price", book.getPrice())
        );
    }

    @Override
    public int delete(int id) throws SQLException {
        return Db.use().del(
                Entity.create("t_book").set("id", id)//where条件
        );
    }

    @Override
    public int update(Book book) throws SQLException {
        return Db.use().update(
                Entity.create().set("price", book.getPrice()), //修改的数据
                Entity.create("t_book").set("id", book.getId()) //where条件
        );
    }

    @Override
    public List<Entity> getAllBooks() throws SQLException {
        return Db.use().findAll("t_book");
    }

    @Override
    public Entity get(int id) throws SQLException {
        return Db.use().findAll(Entity.create("t_book").set("id", id)).get(0);
    }
}
