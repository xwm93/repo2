package com.huawei.controller;

import com.huawei.domain.Items;
import com.huawei.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/itmes")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;
    @RequestMapping("/showDetail")
    public String showDetail(Model model){
        Items items = itemsService.findById(1);
        model.addAttribute("item", items);
        return "itemDetail";
    }
}
