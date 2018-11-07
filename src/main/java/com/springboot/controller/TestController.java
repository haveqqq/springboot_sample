package com.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 测试
 * @Auther: chenmingjian
 * @Date: 18-11-7 15:14
 */
@RestController
@RequestMapping("")
public class TestController {

    @RequestMapping("/test")
    public String Test(){
        return "success...";
    }

}
