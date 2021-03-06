package com.bjpowernode.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.bjpowernode.springboot.mapper")//开启扫描mapper接口的包
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
