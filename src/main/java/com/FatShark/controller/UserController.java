package com.FatShark.controller;

import Utils.DateTools;
import com.FatShark.entity.User;
import com.FatShark.entity.VoUser;
import com.FatShark.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    private final Map<String, Object> map = new HashMap<String, Object>();


    //    用户注册
    @PostMapping("/adduser")
    public Map<String, Object> adduser(String username, String password, String phone, String address) {
        String date = DateTools.getDate();
        if (userService.queryByNameOrPhone(phone).size() != 0) {
            map.put("data", null);
        } else {
            VoUser user = new VoUser(username, password, phone, address, null, 1, null, 2, date);
            userService.addUser(user);
            map.put("data", user);
        }
        return map;
    }

    //查询用户
    @PostMapping("/queryUser")
    public User queryUser(int id) {
        return userService.queryUserByID(id);
    }

    //根据id查询用户
    @PostMapping("/queryUserByID")
    public User queryUserByID(Integer id) {
        return userService.queryUserByID(id);
    }

    /**
     * 个人信息功能
     *
     * @return Map
     */
    @PostMapping("/UpdatePeopleInfo")
    public Map<String, Object> UpdatePeopleInfo(Integer id, String username, String phone, String address, Integer gender, String email) {
        User user1 = userService.queryUserByID(id);
        User user = new User(id, username, null, phone, address, null, null, user1.getLevel(), gender, email, null, null, null);
        int result = userService.update(user);
        if (result > 0) {
            map.put("data", result);
        } else {
            map.put("data", null);
        }
        return map;
    }

    @PostMapping("/queryByIDAndPassword")
    public Map<String, Object> queryByIDAndPassword(Integer id, String password) {
        User result = userService.queryByIDAndPassword(id, password);
        map.put("data", result);
        return map;
    }

    @PostMapping("/updatePassword")
    public Map<String, Object> updatePassword(Integer id, String password) {
        int result = userService.updatePassword(id, password);
        map.put("data", result);
        return map;
    }
}