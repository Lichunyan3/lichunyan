package com.example.demo.controller;

import com.example.demo.domain.MyException;
import com.example.demo.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ExceptionController {
    @RequestMapping(value = "/api/v1/test_ext")
    public Object index(){
        return new User(12,"lcy1736","123132",new Date());
    }

    @RequestMapping(value = "/api/v1/myext")
    public Object myexc(){
        throw new MyException("500","my ext异常");
    }
}
