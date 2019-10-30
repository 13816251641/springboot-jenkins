package com.lujieni.springbootjenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther ljn
 * @Date 2019/10/29
 */
@RestController
public class JenkinsController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello Jenkins1";
    }
}
