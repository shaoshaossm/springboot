package com.bjpowernode.spribgboot.web;

import com.bjpowernode.spribgboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping(value = "/literal")
    public String literal(Model model) {
        model.addAttribute("sex", 1);
        model.addAttribute("data", "springboot data");
        model.addAttribute("flag", true);

        User userDetail = new User();
        model.addAttribute("userDetail", userDetail);

        User user = new User();
        user.setId(1001);
        user.setUsername("zs");
        model.addAttribute("user", user);

        return "literal";

    }
    @RequestMapping(value = "/splice")
    public String splice(Model model){
        model.addAttribute("totalRows",123);
        model.addAttribute("totalPage",13);
        model.addAttribute("currentPage",2);
return "splice";
    }
}
