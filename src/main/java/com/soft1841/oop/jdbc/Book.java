package com.soft1841.oop.jdbc;

/**
 * 图书实体类
 *
 * @author moqi
 */
public class Book {
    //属性建议都用包装类型,如int->Integer,float->Float,double->Double
    private Integer id;
    private String name;
    private Double price;

    public Book(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Book() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
