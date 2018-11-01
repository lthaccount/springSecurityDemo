package com.hanlong.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class TestController {
    @PreAuthorize(value = "@premissionBean.pre()")
    @RequestMapping("/login")
    public void login(){
        System.out.println("登陆!");
    }
}
