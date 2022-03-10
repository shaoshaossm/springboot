package com.bjpowernode.springboot.config;

import com.bjpowernode.springboot.interceptor.UserInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration //定义此类为配置类(相当于xml文件)
public class InterceptorConfig implements WebMvcConfigurer {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截user下的所有请求
        String [] addPathPatterns = {
            "/user/**"
        };
        //要排除的路径
        String [] excludePathPatterns = {
            "user/out","/user/error","/user/login"
        };
        registry.addInterceptor(new UserInterceptor()).addPathPatterns(addPathPatterns).excludePathPatterns(excludePathPatterns);

    }
}
