package com.bjpowernode.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @Value("${name}")
    private String name;
    @Value("${name2}")
    private String name2;
    @RequestMapping(value = "/springboot/say")
    @ResponseBody
    public String say(){
        return  "Hello Springboot"+name+"--"+name2;
    }
    @GetMapping(value = "index")
    public String index() {
        return "index";
    }
}
