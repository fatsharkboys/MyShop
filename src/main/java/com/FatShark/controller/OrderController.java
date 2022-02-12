package com.FatShark.controller;

import Utils.DateTools;
import com.FatShark.entity.Order;
import com.FatShark.entity.Project;
import com.FatShark.entity.User;
import com.FatShark.service.OrderService;
import com.FatShark.service.ProjectService;
import com.FatShark.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Order)表控制层
 *
 * @author makejava
 * @since 2021-11-03 07:53:49
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    /**
     * 服务对象
     */
    @Resource
    private OrderService orderService;
    private final Map<String, Object> map = new HashMap<String, Object>();
    @Autowired
    private ProjectService projectService;
    @Autowired
    private UserService userService;

    /**
     * 分页查询数据
     */
    @PostMapping("/queryAll")
    public Map<String, Object> queryAll(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "6") int limit) {
        List<Order> orders = orderService.queryAllByLimit((page - 1), limit);
        List<Order> list = orderService.queryAll();
        map.put("data", orders);
        map.put("count", list.size());
        map.put("code", 0);
        return map;
    }

    @PostMapping("/queryByName")
    public Map<String, Object> queryByID(@RequestParam("username") String username) {
        if (username != null) {
            List<Order> order = orderService.queryByUsername(username);
            map.put("code", 0);
            map.put("data", order);
            return map;
        } else {
            map.put("data", null);
        }
        return map;
    }

    @PostMapping("/toUpdate")
    public Order toUpdate(Integer id) {
        return orderService.queryById(id);
    }

    @PostMapping("/updateOrder")
    public Map<String, Object> updateOrder(Integer id, Integer pay, Integer send) {
        Order order = new Order(id, null, null, pay, send, null, null, null);
        int result = orderService.update(order);
        if (result > 0) {
            map.put("data", order);
        } else {
            map.put("data", null);
        }
        return map;
    }

    @PostMapping("/addOrder")
    public Map<String, Object> addOrder(int orderPr, int id) {
        String date = DateTools.getDate();
        Order order = new Order(null, id, date, 2, 2, orderPr, null, null);
        int insert = orderService.insert(order);
        if (insert > 0) {
            map.put("data", insert);
            return map;
        } else {
            map.put("data", null);
        }
        return map;
    }

    @PostMapping("/delOrder")
    public Map<String, Object> delOrder(Integer id) {
        int result = orderService.deleteById(id);
        if (result > 0) {
            map.put("data", result);
            map.put("message", "删除成功");
        } else {
            map.put("data", null);
        }
        return map;
    }

    @RequestMapping("/queryByUserID")
    public Map<String, Object> queryByID(Integer id, int page, int limit) {
        List<Order> orders = orderService.queryByUserID(id, (page - 1), limit);
        map.put("code", 0);
        if (orders != null) {
            map.put("data", orders);
            map.put("count", orders.size());
            return map;
        } else {
            map.put("data", null);
        }
        return map;
    }

    //添加到购物车
    @PostMapping("/putOrder")
    public Map<String, Object> putOrder(int id, int orderID) {
        User user = userService.queryUserByID(orderID);
        Project project = projectService.queryById(id);
        String date = DateTools.getDate();
        Order order = new Order(null, orderID, date, 2, 2, project.getId(), null, null);
        int insert = orderService.insert(order);
        map.put("code", 0);
        if (insert > 0) {
            map.put("data", insert);
            return map;
        } else {
            map.put("data", null);
        }
        return map;
    }

    //点击购买后更新订单
    @PostMapping("/updateOrder2")
    public Map<String, Object> updateOrder2(int id, Integer pay, Integer send) {
        Order order1 = orderService.queryById(id);
        Order order = new Order(order1.getId(), order1.getOrderID(), order1.getOrderTime(), pay, send, order1.getOrderPr(), null, null);
        int result = orderService.update(order);
        if (result > 0) {
            map.put("data", order);
        } else {
            map.put("data", null);
        }
        return map;
    }
}