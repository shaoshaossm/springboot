package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/put")
    @ResponseBody
    public Object put(String key,String value){
        studentService.put(key,value);
        return "值已成功存入";
    }
    @RequestMapping(value = "/get")
    @ResponseBody
    public String get(){
        String count = studentService.getkey("count");
        return "数据count为: "+count;
    }

    @RequestMapping(value = "getplus")
    @ResponseBody
    public String getplus(String key){
        String count = studentService.getkeyplus(key);
        return key+ "的数据为: "+count;
    }

}
