package com.bjpowernode.springboot;

import com.bjpowernode.springboot.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		StudentService studentService = (StudentService) applicationContext.getBean("studentServiceImpl");
		String sayHello = studentService.sayHello();
		System.out.println(sayHello);
	}

}
