package com.soft1841.oop.list;

import java.util.List;

public interface GoodsDAO {
    /**
     * 获取所有商品
     * @return
     */
    List<Goods> getAllGoods();

    /**
     * 新增商品
     * @param goods
     */
    void insertGoods(Goods goods);

    /**
     * 根据id删除商品
     * @param id
     */
    void deleteGoodsById(int id);

    /**
     * 根据id查询商品
     * @param id
     * @return
     */
    Goods getGoodsById(int id);

    /**
     * 修改商品信息
     * @param goods
     */
    void modifyGoods(Goods goods);

    /**
     * 初始化
     * @param goodsList
     */
    void init(List<Goods> goodsList);
}
