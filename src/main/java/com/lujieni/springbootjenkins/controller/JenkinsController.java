package com.lujieni.springbootjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther ljn
 * @Date 2019/10/29
 */
@RestController
public class JenkinsController {
    @GetMapping("/hello")
    public String hello(){
        return "hello Jenkins";
    }
}
