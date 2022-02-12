package com.FatShark.service.impl;

import com.FatShark.dao.UserDao;
import com.FatShark.entity.User;
import com.FatShark.entity.VoUser;
import com.FatShark.service.UserService;


import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User queryUserByID(int id) {
        return userDao.queryUserByID(id);
    }

    @Override
    public List<User> queryByNameOrPhone(String str) {
        return userDao.queryByNameOrPhone(str);
    }

    @Override
    public List<User> queryAllUserInfo() {
        return userDao.queryAllUserInfo();
    }

    @Override
    public User queryByNameAndPassword(User user) {
        return userDao.queryByNameAndPassword(user);
    }

    @Override
    public User queryByIDAndPassword(int id, String password) {
        return userDao.queryByIDAndPassword(id,password);
    }

    @Override
    public List<User> queryAllByLimit(int offset, int limit) {
        return userDao.queryAllByLimit(offset, limit);
    }

    @Override
    public int addUser(VoUser user) {
        return userDao.addUser(user);
    }

    @Override
    public int updatePassword(int id, String password) {
        return userDao.updatePassword(id, password);
    }

    @Override
    public int update(User user) {
        return userDao.update(user);
    }

    @Override
    public int deleteById(Integer id) {
        return userDao.deleteById(id);
    }
}