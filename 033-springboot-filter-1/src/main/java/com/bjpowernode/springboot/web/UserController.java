package com.bjpowernode.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping(value = "/user/detail")
    @ResponseBody
    public String userDetail(){

        return "/user/detailaaaaaaaa";
    }

    @RequestMapping(value = "/center")
    @ResponseBody
    public String center(){

        return "center";
    }
}