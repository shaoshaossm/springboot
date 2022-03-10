package com.bjpowernode.springboot;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.bjpowernode.springboot.mapper")
@EnableDubboConfiguration //开启dubboo配置
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
