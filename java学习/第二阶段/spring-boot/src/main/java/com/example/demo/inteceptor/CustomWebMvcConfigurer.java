package com.example.demo.inteceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CustomWebMvcConfigurer implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginIntercepter()).addPathPatterns("/api2/*/**");
        registry.addInterceptor(new TwoIntercepter()).addPathPatterns("/api2/*/**");
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
