package com.FatShark.controller;

import com.FatShark.entity.Shop;
import com.FatShark.service.ShopService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Shop)表控制层
 *
 * @author makejava
 * @since 2021-11-03 07:56:04
 */
@Controller
@RequestMapping("/shop")
public class ShopController {


    @RequestMapping("/Business")
    public String toBusiness() {
        return "shop/Business";
    }

    @Resource
    private ShopService shopService;



}