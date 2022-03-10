package com.bjpowernode.springboot.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bjpowernode.springboot.model.Student;
import com.bjpowernode.springboot.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
    @Reference(interfaceClass = StudentService.class, version = "1.0.0")
    private StudentService studentService;

    @RequestMapping(value = "/student/detail/{id}")
    public String studentDetail(Model model,
                                @PathVariable("id") Integer id) {

        Student student = studentService.queryStudentById(id);
        model.addAttribute("student", student);
        return "studentDetail";
    }

    @GetMapping(value = "/student/all/count")
    public @ResponseBody
    Object allStudentCount() {

        Integer allStudentCount = studentService.queryAllStudentCount();

        return "学生总人数为:"+allStudentCount;
    }

}
