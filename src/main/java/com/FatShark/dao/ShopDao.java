package com.FatShark.dao;

import com.FatShark.entity.Shop;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Shop)表数据库访问层
 *
 * @author makejava
 * @since 2021-11-03 07:56:04
 */
public interface ShopDao {


    /**
     * 通过BossName查询单条数据
     *
     * @return 实例对象
     */
    List<Shop> queryAllProjectInfo();

    /**
     * 通过id查询单条数据
     *
     * @return 实例对象
     */
    List<Shop> queryShopInfoByName(String shopName);


    Shop queryShopInfoByID(int id);

    Shop queryShopInfoByShopID(int shopID);
    /**
     * 通过BossName查询单条数据
     *
     * @return 实例对象
     */
    List<Shop> queryShopInfo();

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Shop> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 新增数据
     *
     * @param shop 实例对象
     * @return 影响行数
     */
    int insert(Shop shop);

    /**
     * 修改数据
     *
     * @param shop 实例对象
     * @return 影响行数
     */
    int update(Shop shop);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}