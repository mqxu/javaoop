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
    private String author;
    private Double price;
    private String cover;


    public Book(String name, String author, Double price, String cover) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.cover = cover;
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

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", cover='" + cover + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
