package com.itpein.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {
    @RequestMapping("/success")
    public String hello(Map<String,Object> map){
        map.put("hello","hello thymeleaf");
        map.put("users", Arrays.asList("xs","www","ccc"));
        System.out.println("xxxx");
        return "success";
    }
}
