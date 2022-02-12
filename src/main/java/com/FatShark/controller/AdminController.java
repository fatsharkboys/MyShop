package com.FatShark.controller;

import com.FatShark.entity.Project;
import com.FatShark.entity.Shop;
import com.FatShark.entity.User;
import com.FatShark.service.ProjectService;
import com.FatShark.service.ShopService;
import com.FatShark.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private UserService userService;
    @Autowired
    private ShopService shopService;
    @Autowired
    private ProjectService projectService;
    private final Map<String, Object> map = new HashMap<String, Object>();

    //查找所有用户信息
    @PostMapping("/all")
    public Map<String, Object> queryAllUserInfo(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "6") int limit) {
        List<User> list = userService.queryAllUserInfo();
        List<User> users = userService.queryAllByLimit((page - 1) * limit, limit);
        System.out.println(page+":"+limit);
        map.put("data", users);
        map.put("count", list.size());
        map.put("code", 0);
        return map;
    }


    //查找用户信息
    @PostMapping("/a1")
    public Map<String, Object> queryByNameOrPhone(@RequestParam("username") String username) {
        List<User> list = userService.queryByNameOrPhone(username);
        map.put("code", 0);
        if (list.size() != 0) {
            map.put("data", list);
            return map;
        }
        map.put("data", null);
        return map;
    }

    @PostMapping("/toUpdate")
    public User toUpdate(Model model, Integer id) {
        User user = userService.queryUserByID(id);
        model.addAttribute("user", user);
        return user;
    }

    @PostMapping("/updateUserInfo")
    public Map<String, Object> updateUserInfo(User user) {
        Map<String, Object> result = new HashMap<String, Object>();
        if (user.getGender() != 0 && user.getLevel() != 0) {
            userService.update(user);
            User user1 = userService.queryUserByID(user.getId());
            if (user1 != null) {
                result.put("data", map);
                return result;
            }
        }
        result.put("data", null);
        return result;
    }

    //删除用户信息
    @PostMapping("/del")
    public Map<String, Object> deleteUser(Integer id) {
        int i = userService.deleteById(id);
        map.put("code", 0);
        if (i == 1) {
            map.put("message", "删除成功！");
        } else {
            map.put("message", "删除失败！");
        }
        return map;
    }

    /**
     * 管理员对店铺的操作
     */

    @PostMapping("/shopAll")
    public Map<String, Object> queryAllShopInfo(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "5") int limit) {
        List<Shop> list = shopService.queryShopInfo();
        List<Shop> shops = shopService.queryAllByLimit((page - 1) * limit, limit);
        map.put("code", 0);
        map.put("count", list.size());
        map.put("data", shops);
        return map;
    }

    @PostMapping("/toUpdateShop")
    public Shop toUpdateShop(int id) {
        return shopService.queryShopInfoByID(id);
    }

    @PostMapping("/updateShopInfo")
    public Map<String, Object> updateShopInfo(Integer id, String shopName, String shopAddress) {
        Shop shop1 = shopService.queryShopInfoByID(id);
        Shop shop = new Shop(id, shop1.getShopID(), shopName, shopAddress, shop1.getShopProjectID(), shop1.getUser(), shop1.getProject());
        int result = shopService.update(shop);
        if (result > 0) {
            map.put("data", shop);
        } else {
            map.put("data", null);
        }
        return map;
    }

    //查找店铺信息
    @PostMapping("/a2")
    public Map<String, Object> queryByName(@RequestParam("shopName") String shopName) {
        List<Shop> list = shopService.queryShopInfoByName(shopName);
        map.put("code", 0);
        if (list.size() != 0) {
            map.put("data", list);
            return map;
        }
        map.put("data", null);
        return map;
    }


    /**
     * 管理员对商品的操作
     */

    //查所有货品
    @PostMapping("/ProjectAll")
    public Map<String, Object> ProjectAll(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "5") int limit) {
        List<Project> list = projectService.queryAllInfo();
        List<Project> projects = projectService.queryAllByLimit((page - 1), limit);
        map.put("code", 0);
        map.put("count", list.size());
        map.put("data", projects);
        return map;
    }

    //更新商品信息
    @PostMapping("/toUpdateProject")
    public Project toUpdateProject(int id) {
        return projectService.queryById(id);
    }

    @PostMapping("/updateProjectInfo")
    public Map<String, Object> updateProjectInfo(Integer id, String projectName, String projectKind, String projectPrice, String projectInfo, Integer projectID) {
        Project project = new Project(id, projectName, projectKind, projectPrice, projectInfo, projectID);
        int result = projectService.update(project);
        if (result > 0) {
            map.put("data", project);
        } else {
            map.put("data", null);
        }
        return map;
    }

    //删除货品
    @PostMapping("/delProject")
    public Map<String, Object> delProject(Integer id) {
        int result = projectService.deleteById(id);
        map.put("data", result);
        return map;
    }

    @PostMapping("/queryProjectName")
    public Map<String, Object> queryProjectName(String projectName) {
        if (projectName != null) {
            List<Project> list = projectService.queryProjectName(projectName);
            if (list.size() != 0) {
                map.put("data", list);
                return map;
            }
        }
        map.put("data", null);
        return map;
    }
}
