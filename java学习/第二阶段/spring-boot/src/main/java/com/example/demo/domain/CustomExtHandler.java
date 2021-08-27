package com.example.demo.domain;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class CustomExtHandler {

    private static final Logger LOG = LoggerFactory.getLogger(CustomExtHandler.class);
    //捕获全局异常，处理所有不可知的异常
    @ExceptionHandler(value = Exception.class)
    //@ResponseBody
    Object handleException(Exception e, HttpServletRequest request){
        LOG.error("url {},msg {}",request.getRequestURL(),e.getMessage());
        //返回json数据，由前端去判断加载什么页面
        Map<String, Object> map = new HashMap<>();
        map.put("code",100);
        map.put("msg",e.getMessage());
        map.put("url",request.getRequestURL());
        return map;
    }

    @ExceptionHandler(value = MyException.class)
    Object handleMyException(Exception e){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error.html");
        modelAndView.addObject("msg",e.getMessage());
        return modelAndView;
    }
}
