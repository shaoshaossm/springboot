package com.bjpowernode.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
@RequestMapping(value = "/index")
    public String index(Model model, HttpServletRequest request,Integer id){
        model.addAttribute("username","lisi");
        request.getSession().setAttribute("data","sessionData");

    return "index";
}

}
