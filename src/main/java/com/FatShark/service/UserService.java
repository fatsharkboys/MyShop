package com.FatShark.service;

import com.FatShark.entity.User;
import com.FatShark.entity.VoUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2021-11-03 10:21:05
 */
public interface UserService {

    /**
     * 查询所有数据
     *
     * @return 实例对象
     */
    User queryUserByID(int id);

    /**
     * @return 实例对象
     */
    List<User> queryByNameOrPhone(String str);

    /**
     * 查询所有数据
     *
     * @return 实例对象
     */
    List<User> queryAllUserInfo();


    /**
     * 通过user对象查询单条数据
     *
     * @param user
     * @return 实例对象
     */
    User queryByNameAndPassword(User user);


    User queryByIDAndPassword(int id,String password);

    /**
     * 查询多条数据
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
     * @return 实例对象
     */
    int addUser(VoUser user);


    /**
     * @param id
     * @param password
     * @return 实例对象
     */
    int updatePassword(int id, String password);

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    int update(User user);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    int deleteById(Integer id);
}