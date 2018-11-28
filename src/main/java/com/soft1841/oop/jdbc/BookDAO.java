package com.soft1841.oop.jdbc;

import cn.hutool.db.Entity;

import java.sql.SQLException;
import java.util.List;

/**
 * 图书数据访问对象接口
 * DAO:Data Access Object
 * 实现对图书实体类的CRUD增删改查操作(Create、Read、Update、Delete)
 *  @author moqi
 */
public interface BookDAO {
    /**
     * 新增图书信息，成功返回1，失败返回0，表示数据表受影响的记录行数
     * @param book
     * @return
     * @throws SQLException
     */
    int insert(Book book) throws SQLException;

    /**
     * 根据id删除图书信息，返回受影响的记录行数
     * @param id
     * @return
     * @throws SQLException
     */
    int delete(int id) throws SQLException;

    /**
     * 修改图书信息，返回受影响的记录行数
     * @param book
     * @return
     * @throws SQLException
     */
    int update(Book book) throws SQLException;

    /**
     * 获取所有实体信息，返回一个集合
     * @return
     * @throws SQLException
     */
    List<Entity> getAllBooks() throws SQLException;

    /**
     * 根据id查询某个实体信息
     * @param id
     * @return
     * @throws SQLException
     */
    Entity get(int id) throws SQLException;

}
