package com.FatShark.Test;


import Utils.DateTools;
import com.FatShark.entity.Shop;
import com.FatShark.entity.User;
import com.FatShark.entity.VoUser;
import com.FatShark.service.ShopService;
import com.FatShark.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test {
    //关于user的操作

    //1.测试admin通过电话或者名字查询用户通过
    @Test
    public void userTest1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserService mapper = context.getBean("UserService", UserService.class);
        List<User> user = mapper.queryByNameOrPhone("12345678910");
        System.out.println(user);
    }

    //2.测试admin直接查询所有用户
    @Test
    public void userTest2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserService mapper = context.getBean("UserService", UserService.class);
        List<User> list = mapper.queryAllUserInfo();
        for (User user : list) {
            System.out.println(user);
        }
    }
    //4.测试登录功能
    @Test
    public void userTest4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserService mapper = context.getBean("userService", UserService.class);
        String date = DateTools.getDate();
        VoUser user = new VoUser("零老板", "123456", "17828284560", "天津", null, 1, null, 2, date);
        mapper.addUser(user);
        List<User> user1 = mapper.queryByNameOrPhone(user.getUsername());
        System.out.println(user1);
    }

    //测试个人信息
    @Test
    public void updateInfo() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserService mapper = context.getBean("userService", UserService.class);
        User user = new User(1, "大老板", null, "17828284561", "四川", null, null, 1, 2, null, null, null, null);
        int result = mapper.update(user);
        System.out.println(result);
    }

    //测试查找店铺
    @Test
    public void checkShop() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ShopService mapper = context.getBean("shopService", ShopService.class);
        List<Shop> shops = mapper.queryShopInfo();
        List<Shop> shops1 = mapper.queryAllByLimit(0, 3);
        System.out.println(shops1);
    }

    //shop操作

    //1.测试shop直接查询所有货物信息
    @Test
    public void shopTest1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ShopService mapper = context.getBean("ShopService", ShopService.class);
        List<Shop> shops = mapper.queryAllProjectInfo();
        for (Shop shop : shops) {
            System.out.println(shop);
        }
    }
}
