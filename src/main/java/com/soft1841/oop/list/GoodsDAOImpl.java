package com.soft1841.oop.list;

import java.util.Iterator;
import java.util.List;

public class GoodsDAOImpl implements GoodsDAO {
    private List<Goods> goodsList;


    @Override
    public List<Goods> getAllGoods() {
        return goodsList;
    }

    @Override
    public void insertGoods(Goods goods) {
        goodsList.add(goods);
    }

    @Override
    public void deleteGoodsById(int id) {
        Iterator<Goods> iterator = goodsList.iterator();
        while (iterator.hasNext()) {
            Goods goods = iterator.next();
            if (goods.getId() == id)
                iterator.remove();
        }
    }

    @Override
    public Goods getGoodsById(int id) {
        for (Goods goods : goodsList) {
            if (goods.getId() == id) {
                return goods;
            }
        }
        return null;
    }

    @Override
    public void modifyGoods(Goods goods) {
        for (Goods g : goodsList) {
            if (g.getId() == goods.getId()) {
                g.setGoodsPrice(goods.getGoodsPrice());
            }
        }
    }

    @Override
    public void init(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }
}
