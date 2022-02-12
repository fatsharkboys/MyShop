package com.FatShark.controller;

import com.FatShark.entity.User;
import com.FatShark.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class LoginController {
    @Autowired
    private UserService userService;
    private final Map<String, Object> map = new HashMap<String, Object>();

    @PostMapping("/a1")
    public Map<String, Object> login(String username, String password, Integer level) {
        User users = new User(null, username, password, null, null, 0, null, level, 0, null, null, null, null);
        User user = userService.queryByNameAndPassword(users);
        map.put("data", user);
        map.put("code", 0);
        return map;
    }
}
