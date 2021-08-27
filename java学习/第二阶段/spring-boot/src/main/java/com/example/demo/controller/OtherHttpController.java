package com.example.demo.controller;

import com.example.demo.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class OtherHttpController {
    private Map<String,Object> params =new HashMap<>();

    @PostMapping("/v1/login")//增加
    public Object login(String id,String pwd){
        params.clear();
        params.put("id",id);
        params.put("pwd",pwd);
        return params;
    }

    @PutMapping("/v1/put")//修改
    public Object put(String id){
        params.clear();
        params.put("id",id);
        return params;
    }

    @DeleteMapping("/v1/del")
    public Object del(String id){
        params.clear();
        params.put("id",id);
        return params;
    }

    @GetMapping("/testjson")
    public Object testjson(){
        return new User(111,"123456","1234132",new Date());
    }
}
