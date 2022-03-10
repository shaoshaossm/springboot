package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.Student;
import com.bjpowernode.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Autowired
    private StudentService serviceStudent;


    @RequestMapping(value = "/student")
    @ResponseBody
    public Student queryStudentById(Integer id){
        Student student = serviceStudent.queryStudentById(id);

        return student;
     }
}
