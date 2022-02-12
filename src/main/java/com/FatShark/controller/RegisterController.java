package com.FatShark.controller;

import com.FatShark.entity.User;
import com.FatShark.entity.VoUser;
import com.FatShark.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/PeopleRegister")
public class RegisterController {

    @Autowired
    private UserService userService;
    public String PeopleRegister(VoUser voUser, Model model) {
        if (voUser != null) {
            userService.addUser(voUser);
            List<User> user = userService.queryByNameOrPhone(voUser.getUsername());
            model.addAttribute("user", user);
            System.out.println(user);
            return "redirect:/user/Customer";
        } else {
            model.addAttribute("error", "注册失败，请重新注册");
            return "register";
        }
    }
}
