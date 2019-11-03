package com.lujieni.springbootjenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther ljn
 * @Date 2019/10/29
 */
@RestController
public class JenkinsController {
    @RequestMapping("/hello")
    public String hello(){
        Map<String,String> map = new HashMap<>();
        return "boy";
    }
}
