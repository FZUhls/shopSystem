package com.zxy.shopsystem.controller;

import com.zxy.shopsystem.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class LoginController {
    private static final String LOGIN = "/login";
    private static final String FAILURE = "/failure";
    private static final String SUCCESS = "/";
    @Autowired
    LoginService loginService;
    @GetMapping(LOGIN)
    public String login(Model model){
        model.addAttribute("title","登录管理系统");
        model.addAttribute("12",12);
        return "home/login";
    }

    @GetMapping(FAILURE)
    public String  loginLogic(Model model){
        model.addAttribute("title","登录失败");
        return "home/fail";
    }
    @GetMapping(SUCCESS)
    public String success(Model model) {
        model.addAttribute("title","库存管理系统");
        return "home/home";
    }
}
