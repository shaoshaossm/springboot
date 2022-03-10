package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.config.Abc;
import com.bjpowernode.springboot.config.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {


    @Autowired
    private School school;

    @Autowired
    private Abc abc;

    @RequestMapping(value = "/say")
    @ResponseBody
    public String say(){
        return "学校名称"+school.getName()+"学校网站： "+school.getWebsit()+" "+abc.getName()+" "+abc.getWebsit();
    }


}
