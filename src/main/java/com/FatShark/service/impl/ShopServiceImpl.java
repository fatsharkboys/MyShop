package com.FatShark.service.impl;

import com.FatShark.entity.Shop;
import com.FatShark.dao.ShopDao;
import com.FatShark.service.ShopService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Shop)表服务实现类
 *
 * @author makejava
 * @since 2021-11-03 07:56:04
 */
@Service("shopService")
public class ShopServiceImpl implements ShopService {
    @Resource
    private ShopDao shopDao;

    public void setShopDao(ShopDao shopDao) {
        this.shopDao = shopDao;
    }

    @Override
    public List<Shop> queryShopInfo() {
        return shopDao.queryShopInfo();
    }

    @Override
    public Shop queryShopInfoByID(int id) {
        return shopDao.queryShopInfoByID(id);
    }

    @Override
    public Shop queryShopInfoByShopID(int id) {
        return this.shopDao.queryShopInfoByShopID(id);
    }

    @Override
    public List<Shop> queryShopInfoByName(String shopName) {
        return shopDao.queryShopInfoByName(shopName);
    }

    @Override
    public List<Shop> queryAllProjectInfo() {
        return shopDao.queryAllProjectInfo();
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Shop> queryAllByLimit(int offset, int limit) {
        return this.shopDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param shop 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(Shop shop) {
        return shopDao.insert(shop);
    }

    /**
     * 修改数据
     *
     * @param shop 实例对象
     * @return 实例对象
     */
    @Override
    public int update(Shop shop) {
        return shopDao.update(shop);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.shopDao.deleteById(id) > 0;
    }
}