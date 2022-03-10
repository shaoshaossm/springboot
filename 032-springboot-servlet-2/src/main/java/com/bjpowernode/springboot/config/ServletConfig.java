package com.bjpowernode.springboot.config;

import com.bjpowernode.springboot.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Servlet;

@Configuration
public class ServletConfig {
    @Bean
    public ServletRegistrationBean myServletRegistrationBean(){
        ServletRegistrationBean<Servlet> servletServletRegistrationBean = new ServletRegistrationBean<>(new MyServlet(),"/myServlet");
        return servletServletRegistrationBean;
    }

}
