package com.hanlong.controller;

import org.springframework.stereotype.Component;

@Component("premissionBean")
public class Premission {
    public boolean pre(){
        System.out.println("开始验证");
        return false;
    }
}
