package com.FatShark.service.impl;

import com.FatShark.entity.Order;
import com.FatShark.dao.OrderDao;
import com.FatShark.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Order)表服务实现类
 *
 * @author makejava
 * @since 2021-11-03 07:53:49
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Order queryById(Integer id) {
        return this.orderDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Order> queryAllByLimit(int offset, int limit) {
        return this.orderDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<Order> queryByUserID(int id, int offset, int limit) {
        return this.orderDao.queryByUserID(id, offset, limit);
    }

    /**
     * 根据用户名来查询订单
     *
     * @param username
     * @return
     */
    @Override
    public List<Order> queryByUsername(String username) {
        return this.orderDao.queryByUsername(username);
    }

    /**
     * 查询所有数据
     *
     * @return 对象集合
     */
    @Override
    public List<Order> queryAll() {
        return orderDao.queryAll();
    }

    /**
     * 新增数据
     *
     * @param order 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(Order order) {
        return orderDao.insert(order);
    }

    /**
     * 修改数据
     *
     * @param order 实例对象
     * @return 实例对象
     */
    @Override
    public int update(Order order) {
        return orderDao.update(order);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(Integer id) {
        return this.orderDao.deleteById(id);
    }
}