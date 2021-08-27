package com.example.demo.controller;

import com.example.demo.domain.JsonData;
import com.example.demo.domain.User2;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import com.example.demo.task.AsyncTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.concurrent.Future;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private AsyncTask task;

    @GetMapping("add")
    public Object add(String msg) {
        User2 user = new User2();
        user.setAge(11);
        user.setCreateTime(new Date());
        user.setName("xdclass");
        user.setPhone("10010000");
        int id = userService.add(user);
        return JsonData.buildSuccess(id);
    }

    @GetMapping("findAll")
    public String findAll() {
        return JsonData.buildSuccess(userMapper.getAll());
    }

    @GetMapping("find_by_id")
    public String findById(Long id) {
        return JsonData.buildSuccess(userMapper.findById(id));
    }

    @GetMapping("del_by_id")
    public String delById(int id) {
        userMapper.delete(id);
        return JsonData.buildSuccess(id);
    }

    @GetMapping("update")
    public String update(String name, int id) {
        User2 user = new User2();
        user.setName(name);
        user.setId(id);
        userMapper.update(user);
        return JsonData.buildSuccess(id);
    }

    //测试事务
    @GetMapping("add_account")
    public Object addAccount() {
        int id = userService.addAccount();
        return JsonData.buildSuccess(id);
    }

    @GetMapping("async_task")
    public JsonData exeTask() throws InterruptedException {
        long start = System.currentTimeMillis();
//        task.task1();
//        task.task2();
//        task.task3();
        Future<String> task4 = task.task4();
        Future<String> task5 = task.task5();
        Future<String> task6 = task.task6();
        while (true) {
            if (task4.isDone() && task5.isDone() && task6.isDone()) {
                break;
            }
        }
        long end = System.currentTimeMillis();
        long total = end - start;
        System.out.println("执行总耗时=" + total);
        return JsonData.buildSuccess(total);
    }

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("log")
    public Object testLog(){
        logger.debug("this is debug level");
        logger.info("this is info level");
        logger.warn("this is warn level");
        logger.error("this is error level");

        return JsonData.buildSuccess();
    }

}
