package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.Student;
import com.bjpowernode.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;
    @RequestMapping(value = "/update/{id}/{name}")
    @ResponseBody
    public Object update(@PathVariable Integer id,@PathVariable String name){
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        int updateCount = studentService.updateStudentById(student);
        return "修改学生id:"+id+ "的结果为: "+updateCount;
    }
}
