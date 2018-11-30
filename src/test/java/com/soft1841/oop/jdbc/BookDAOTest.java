package com.soft1841.oop.jdbc;

import cn.hutool.db.Entity;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

/**
 * BookDAO接口测试类
 *
 * @author moqi
 */
public class BookDAOTest {
    private BookDAO bookDAO = new BookDAOImpl();

    @Test
    public void getAllBooks() throws SQLException {
        //调用bookDAO的查询方法，获取所有图书信息
        List<Entity> list = bookDAO.getAllBooks();
        //lambda表达式遍历List集合
        list.forEach(entity -> System.out.println(entity.get("name")
                + "," + entity.get("author")
                + "," + entity.get("price")));
    }

    @Test
    public void insert() throws SQLException {
        //创建一个等待插入的Book对象，并通过重载的构造方法初始化属性的值
        Book book = new Book(
                "测试书籍",
                "匿名",
                8.88,
                "https://img3.doubanio.com/view/subject/m/public/s2738366.jpg");
        //调用insert方法，返回一个整型数据，要么1，要么0
        int n = bookDAO.insert(book);
        //用断言判定期望值和实际值是否一致，如果一致单元测试就通过
        assertEquals(1, n);
    }

    @Test
    public void delete() throws SQLException {
        //删除id为7的图书信息，返回受影响的记录行数
        int n = bookDAO.delete(7);
        assertEquals(1, n);
    }

    @Test
    public void get() throws SQLException {
        //获取id为1的实体信息
        Entity entity = bookDAO.get(1);
        System.out.println(entity.get("name") + "," + entity.get("price"));
    }

    @Test
    public void update() throws SQLException {
        //创建一个Book对象，将id指定为待修改的图书id，将价格设置为一个新的值
        Book book = new Book();
        book.setId(1);
        book.setPrice(188.9);
        //调用update方法，更新实体信息，得到受影响的记录行数
        int n = bookDAO.update(book);
        //断言判定结果
        assertEquals(1, n);
    }
}