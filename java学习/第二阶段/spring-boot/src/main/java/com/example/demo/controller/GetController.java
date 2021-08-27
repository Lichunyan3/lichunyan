package com.example.demo.controller;

import com.example.demo.domain.ServerSettings;
import com.example.demo.domain.User;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

//测试http协议的get请求
@RestController
public class GetController {
    private Map<String,Object> params =new HashMap<>();
//    @RequestMapping(path="/{city_id}/{user_id}",method = RequestMethod.GET)
//    public Object findUser(@PathVariable("city_id") String cityId,
//                           @PathVariable("user_id") String userId) {
//        params.clear();
//        params.put("cityId",cityId);
//        params.put("userId",userId);
//        return params;
//    }

    @GetMapping(value = "/v1/page_user1")
    public Object pageUser(int from,int size){
        params.clear();
        params.put("from",from);
        params.put("size",size);
        return params;
    }

    @GetMapping(value = "/v1/page_user2")
    public Object pageUserV2(@RequestParam(defaultValue = "0",name = "page") int from,int size){
        params.clear();
        params.put("from",from);
        params.put("size",size);
        return params;
    }

    @RequestMapping("/v1/save_user")
    public Object saveUser(@RequestBody User user){
        params.clear();
        params.put("user",user);
        return params;
    }

    @RequestMapping("/test/home")
    public String home(){
        return "xdclass";
    }

    @GetMapping("/v1/get_header")
    public Object getHeader(@RequestHeader("access_token") String accessToken,String id){
        params.clear();
        params.put("access_token",accessToken);
        params.put("id",id);
        return params;
    }

    @GetMapping("/v1/test_request")
    public Object testRequest(HttpServletRequest request){
        params.clear();
        String id = request.getParameter("id");
        params.put("id",id);
        return params;
    }

    @Autowired
    private ServerSettings serverSettings;

    @GetMapping("/v1/test_properties")
    public Object testProperties(){

        return serverSettings;
    }

    @GetMapping("/api2/v1/account")
    public Object account(){
        params.clear();
        System.out.println("controller...");
        params.put("money","1000");
        return params;
    }

}
