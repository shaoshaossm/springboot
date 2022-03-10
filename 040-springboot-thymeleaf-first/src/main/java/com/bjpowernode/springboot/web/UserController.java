package com.bjpowernode.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping(value = "/user/detail")
    public String message(Model model){
        model.addAttribute("data","springboot继承thtmeleaf模板引擎!");
        return "message";
    }

}
