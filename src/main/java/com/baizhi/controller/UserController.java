package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("selectAll")
    @ResponseBody
    public List<User> selectAll(ModelMap modelMap){
        System.out.println("123456");
        List<User> list=userService.selectAll();
        modelMap.addAttribute("list",list);
        return list;
    }
}
