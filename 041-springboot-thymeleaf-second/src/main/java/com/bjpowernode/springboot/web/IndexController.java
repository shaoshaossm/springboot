package com.bjpowernode.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping(value = "/index")
    public String index(Model model){
        model.addAttribute("data","SpringBoot Thymeleaf!");
        return "index";
    }

}
