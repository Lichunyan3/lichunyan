package com.example.demo.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

//定时任务业务类
//@Component
public class TestTask {
    @Scheduled(fixedRate = 1000)//1秒执行一次
    //@Scheduled(cron = "*/1 * * * * *")
    public void sum(){
        System.out.println("当前时间："+new Date());
    }
}
