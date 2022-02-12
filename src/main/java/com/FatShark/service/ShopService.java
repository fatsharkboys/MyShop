package com.FatShark.service;

import com.FatShark.entity.Shop;

import java.util.List;

/**
 * (Shop)表服务接口
 *
 * @author makejava
 * @since 2021-11-03 07:56:04
 */
public interface ShopService {

    /**
     * 通过BossName查询单条数据
     *
     * @return 实例对象
     */
    List<Shop> queryShopInfo();

    /**
     * 通过id查询单条数据
     *
     * @return 实例对象
     */
    Shop queryShopInfoByID(int id);


    Shop queryShopInfoByShopID(int id);


    List<Shop> queryShopInfoByName(String shopName);

    /**
     * 通过查询单条数据
     *
     * @return 实例对象
     */
    List<Shop> queryAllProjectInfo();

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Shop> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param shop 实例对象
     * @return 实例对象
     */
    int insert(Shop shop);

    /**
     * 修改数据
     *
     * @param shop 实例对象
     * @return 实例对象
     */
    int update(Shop shop);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}