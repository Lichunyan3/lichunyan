package com.example.demo.controller;

import com.example.demo.domain.JsonData;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
@PropertySource({"classpath:application.properties"})
public class FileController {
    @RequestMapping(value = "/api/v1/gopage")
    public Object index(){
        return "index";
    }

    //private static final String filepath = "E:/java_study/code/spring-boot/src/main/resources/static/images/";
    @Value("${web.file.path}")
    private String filepath;

    @RequestMapping(value = "upload")
    @ResponseBody
    public JsonData upload(@RequestParam("head_img")MultipartFile file, HttpServletRequest request) {
        //file.isEmpty(); 判断图片是否为空
        //file.getSize();图片大小进行判断

        String name = request.getParameter("name");
        System.out.println("用户名："+name);
        //获取文件名
        String fileName = file.getOriginalFilename();
        System.out.println("上传的文件名为："+fileName);
        //获取文件的后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        System.out.println("上传的后缀名为："+suffixName);
        //文件上传后的路径
        fileName = UUID.randomUUID()+suffixName;
        System.out.println("转换后的名称："+fileName);
        File dest = new File(filepath+fileName);
        try {
            file.transferTo(dest);
            return new JsonData(0,fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new JsonData(-1,"上传失败");
    }
}
