package com.FatShark.controller;

import Utils.randomTools;
import com.FatShark.entity.Project;
import com.FatShark.entity.Shop;
import com.FatShark.entity.User;
import com.FatShark.service.ProjectService;
import com.FatShark.service.ShopService;
import com.FatShark.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Project)表控制层
 *
 * @author makejava
 * @since 2021-11-03 07:55:50
 */
@RestController
@RequestMapping("/project")
public class ProjectController {
    /**
     * 服务对象
     */
    @Resource
    @Autowired
    private ProjectService projectService;
    @Autowired
    private ShopService shopService;
    @Autowired
    private UserService userService;
    private final Map<String, Object> map = new HashMap<String, Object>();

    //商家添加商品
    @PostMapping("/addProject")
    public Map<String, Object> addProject(int id, String projectName, String projectKind, String projectPrice, String projectInfo) {
        User user = userService.queryUserByID(id);
        Shop shop = shopService.queryShopInfoByShopID(user.getShopID());
        Project project = new Project(null, projectName, projectKind, projectPrice, projectInfo, shop.getShopProjectID());
        int insert = projectService.insert(project);
        map.put("code", 0);
        if (insert > 0) {
            map.put("data", insert);
            return map;
        } else {
            map.put("data", null);
        }
        return map;
    }

    //查找本店商品
    @PostMapping("/queryLocalProject")
    public Map<String, Object> queryLocalProject(Integer id, int page, int limit) {
        User user = userService.queryUserByID(id);
        Shop shop = shopService.queryShopInfoByShopID(user.getShopID());
        List<Project> projects = projectService.queryLocalProject(shop.getShopProjectID(), (page - 1), limit);
        map.put("code", 0);
        if (projects != null) {
            map.put("data", projects);
            map.put("count", projects.size());
            return map;
        } else {
            map.put("data", null);
        }
        return map;
    }

    //查找商品
    @PostMapping("/queryByProjectName")
    public Map<String, Object> queryByProjectName(String projectName) {
        List<Project> projects = projectService.queryProjectName(projectName);
        map.put("code", 0);
        if (projects != null) {
            map.put("count", projects.size());
            map.put("data", projects);
            return map;
        } else {
            map.put("data", null);
        }
        return map;
    }

    //删除本店商品
    @PostMapping("/delProject")
    public Map<String, Object> delProject(int id) {
        int i = projectService.deleteById(id);
        map.put("code", 0);
        if (i > 0) {
            map.put("data", i);
            return map;
        } else {
            map.put("data", null);
        }
        return map;
    }

    //分类商品的查询
    @PostMapping("/queryByPhone")
    public Map<String, Object> queryByPhone(int page, int limit) {
        String projectKind = "手机类";
        List<Project> projects = projectService.queryByProjectKind(projectKind, (page - 1), limit);
        map.put("code", 0);
        if (projects != null) {
            map.put("data", projects);
            map.put("count", projects.size());
            return map;
        } else {
            map.put("data", null);
        }
        return map;
    }

    @PostMapping("/queryByComputer")
    public Map<String, Object> queryByComputer(int page, int limit) {
        String projectKind = "电脑类";
        List<Project> projects = projectService.queryByProjectKind(projectKind, (page - 1), limit);
        map.put("code", 0);
        if (projects != null) {
            map.put("data", projects);
            map.put("count", projects.size());
            return map;
        } else {
            map.put("data", null);
        }
        return map;
    }
}