package com.FatShark.dao;

import com.FatShark.entity.User;
import com.FatShark.entity.VoUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2021-11-03 10:21:05
 */
public interface UserDao {

    /**
     * 查询所有数据
     *
     * @return 实例对象
     */
    List<User> queryAllUserInfo();

    /**
     * 查询所有数据
     *
     * @return 实例对象
     */
    User queryUserByID(int id);


    /**
     * 通过username查询单条数据
     *
     * @return 实例对象
     */
    List<User> queryByNameOrPhone(String str);


    /**
     * 登录功能
     *
     * @param user
     * @return 实例对象集合
     */
    User queryByNameAndPassword(User user);


    User queryByIDAndPassword(int id,String password);

    /**
     * 分页查询
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<User> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 影响行数
     */
    int addUser(VoUser user);

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 影响行数
     */
    int update(User user);

    int updatePassword(int id, String password);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);
}