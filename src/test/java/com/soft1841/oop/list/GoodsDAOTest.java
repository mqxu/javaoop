package com.soft1841.oop.list;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GoodsDAOTest {

    private GoodsDAO goodsDAO;
    private List<Goods> goodsList;

    @Before
    public void setUp() throws Exception {
        goodsDAO = new GoodsDAOImpl();
        goodsList = new ArrayList<>();
        Goods goods1 = new Goods(1001, "iPhoneX", 8888.0);
        Goods goods2 = new Goods(1002, "mac pro", 18888.0);
        Goods goods3 = new Goods(1003, "iPad mini", 2888.0);
        goodsList.add(goods1);
        goodsList.add(goods2);
        goodsList.add(goods3);
        goodsDAO.init(goodsList);
    }

    @Test
    public void getAllGoods() {
        List<Goods> goodsList = goodsDAO.getAllGoods();
        showGoods(goodsList);
    }

    @Test
    public void insertGoods() {
        Goods goods4 = new Goods(1004, "iWatch", 3888.0);
        goodsDAO.insertGoods(goods4);
        assertEquals(4, goodsDAO.getAllGoods().size());
        showGoods(goodsList);
    }

    @Test
    public void deleteGoodsById() {
        goodsDAO.deleteGoodsById(1003);
        showGoods(goodsList);
    }

    @Test
    public void getGoodsById() {
        Goods goods = goodsDAO.getGoodsById(1001);
        System.out.println(goods);
    }

    @Test
    public void modifyGoods() {
        Goods goods = goodsDAO.getGoodsById(1001);
        goods.setGoodsPrice(9888);
        showGoods(goodsList);
    }

    private void showGoods(List<Goods> goodsList) {
        goodsList.forEach(goods -> System.out.println(goods));
    }
}