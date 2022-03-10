package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;

//@Controller
@RestController //相当于   @Controller 加 @ResponseBody, 意味着控制层类中的所有方法返回单都是JSON对象
public class StudentController {
    @RequestMapping(value = "/student")
    public Object student(){
        Student student = new Student();
        student.setId(1001);
        student.setName("zhangsan");
        return student;
    }
    @RequestMapping(value = "/queryStudentById",method = {RequestMethod.GET,RequestMethod.POST})
    public Object queryStudentById(Integer id){
        Student student = new Student();
        student.setId(id);
        return student;

    }

    //@RequestMapping(value = "/queryStudentById2",method = RequestMethod.GET)
    @GetMapping(value = "/queryStudentById2") //相当于上句代码
    public Object queryStudentById2(){

        return "Only GET Method";

    }
    //@RequestMapping(value = "/insert",method = RequestMethod.POST)
    @PostMapping(value = "/insert") //相当于上句代码
    public Object insert(){

        return "Insert Success";

    }
    //@RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    @DeleteMapping(value = "/delete") //相当于上句代码
    public Object delete(){

        return "Delete Success";

    }
    //@RequestMapping(value = "/update",method = RequestMethod.PUT)
  @PutMapping(value = "/update") //相当于上句代码
    public Object update(){

        return "Update Success";

    }
}
