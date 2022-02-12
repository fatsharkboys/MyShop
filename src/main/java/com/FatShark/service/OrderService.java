package com.FatShark.service;

import com.FatShark.entity.Order;

import java.util.List;

/**
 * (Order)表服务接口
 *
 * @author makejava
 * @since 2021-11-03 07:53:49
 */
public interface OrderService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Order queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Order> queryAllByLimit(int offset, int limit);


    List<Order> queryByUserID(int id, int offset, int limit);

    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    List<Order> queryByUsername(String username);

    /**
     * 查询所有数据
     *
     * @return 对象集合
     */
    List<Order> queryAll();

    /**
     * 新增数据
     *
     * @param order 实例对象
     * @return 实例对象
     */
    int insert(Order order);

    /**
     * 修改数据
     *
     * @param order 实例对象
     * @return 实例对象
     */
    int update(Order order);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    int deleteById(Integer id);

}