package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    //用户登录的请求
    @RequestMapping(value = "/login")
    public @ResponseBody Object login(HttpServletRequest request){
        //将用户信息存放到session中
        User user = new User();
        user.setId(1001);
        user.setUsername("zhangsan");
        request.getSession().setAttribute("user",user);
        return  "login Success";
    }
    //该请求用户登录后才可以访问
    @RequestMapping(value = "center")
    @ResponseBody
    public  Object center(){
        return "See Center Message";

    }
    //该请求不登录也可以访问
    @RequestMapping(value = "/out")
    public @ResponseBody Object out(){
        return "out see anytime";
    }

    //如果用户未登录访问了需要登录才可访问的请求,之后会跳转到该页面
    @RequestMapping(value = "/error")
    @ResponseBody
    public Object erroe(){
        return "error";
    }
}
