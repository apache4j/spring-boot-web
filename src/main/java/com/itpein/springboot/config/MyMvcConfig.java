package com.itpein.springboot.config;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//使用WebMvcConfigurer可以扩展SpringMvc的功能
//@EnableWebMvc全面接管springMvc,SpringMVC的自动配置都失效了
@Configuration
public class MyMvcConfig implements WebMvcConfigurer{
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/pein").setViewName("success");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

    }
}
