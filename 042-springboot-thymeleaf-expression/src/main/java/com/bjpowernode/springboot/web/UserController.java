package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping(value = "/user/detail")
    public ModelAndView userDetail(){
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        user.setId(1001);
        user.setUsername("lisi");
        user.setAge(22);
        modelAndView.addObject("user",user);
        modelAndView.setViewName("userDetail");
        return modelAndView;
    }

    @RequestMapping(value = "/url")
    public String urlException1(Model model){
        model.addAttribute("id",1001);
        model.addAttribute("username","lisi");
        model.addAttribute("age",123);
        return "url";
    }

    @RequestMapping(value = "/test")
    @ResponseBody
    public String test(String username){
        return "请求路劲参数:"+username;
    }


    @RequestMapping(value = "/test1")
    @ResponseBody
    public String test1(Integer id,String username,Integer age){
        return "请求路劲参数:"+"id:"+id+"age: "+age+"username :"+username;
    }

    @RequestMapping(value = "/test2/{id}")
    @ResponseBody
    public String  test2(@PathVariable("id") Integer id){
        return "ID:"+id;
    }

    @RequestMapping(value = "/test3/{id}/{username}")
    @ResponseBody
    public String  test3(@PathVariable("id") Integer id,
                        @PathVariable("username") String username){
        return "ID:"+id+"username: "+username;
    }

    @RequestMapping(value = "/url2")
    public String url2(){
        return "url2";
    }
    @RequestMapping(value = "/property")
    public String property(){
        return "property";
    }



}
