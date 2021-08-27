package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.MultipartConfigElement;

@SpringBootApplication
@RestController
@ServletComponentScan
@MapperScan("com.example.demo.mapper")
@EnableScheduling//开启定时任务
@EnableAsync//开启异步任务
public class DemoApplication extends SpringBootServletInitializer {

//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
//        return application.sources((DemoApplication.class));
//    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public MultipartConfigElement multipartConfigElement(){
        MultipartConfigFactory factory = new MultipartConfigFactory();
        //单个文件最大
        factory.setMaxFileSize("10240KB"); //KB,MB
        //设置总上传数据大小
        factory.setMaxRequestSize("1024000KB");
        return factory.createMultipartConfig();
    }
}
