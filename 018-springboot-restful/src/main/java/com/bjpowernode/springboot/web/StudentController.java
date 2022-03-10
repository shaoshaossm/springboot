package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.Student;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {
    @RequestMapping(value = "/student")
    public Object student(Integer id,Integer age){
        Student student = new Student();
        student.setId(id);
        student.setAge(age);
        return student;
    }
//@RequestMapping(value = "/student/Detail/{id}/{age}")
@GetMapping(value = "/student/Detail/{id}/{age}")
    public Object student1(@PathVariable("id") Integer id,
                           @PathVariable("age") Integer age){
        Map<String, Object> retMap = new HashMap<>();
        retMap.put("id" ,id);
        retMap.put("age" ,age);
        return retMap;
    }
//@RequestMapping(value = "/student/Detail/{id}/{status}")
@DeleteMapping(value = "/student/Detail/{id}/{status}")
public Object student2(@PathVariable("id") Integer id,
                       @PathVariable("status") Integer status){
    Map<String, Object> retMap = new HashMap<>();
    retMap.put("id" ,id);
    retMap.put("status" ,status);
    return retMap;
}

@DeleteMapping(value = "/student/{id}/Detail/{city}")
public Object student3(@PathVariable("id") Integer id,
                       @PathVariable("city") Integer city){
    Map<String, Object> retMap = new HashMap<>();
    retMap.put("id" ,id);
    retMap.put("city" ,city);
    return retMap;
}
@PostMapping(value = "/student/{id}")
    public Object addStudent(@PathVariable("id") Integer id){
        return "add Student ID" + id;
 }
@PutMapping(value = "/student/{id}")
public Object updateStudent(@PathVariable("id") Integer id){
    return "update Student ID" + id;
}

}
