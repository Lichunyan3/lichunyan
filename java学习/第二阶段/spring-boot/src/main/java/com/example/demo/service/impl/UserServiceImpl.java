package com.example.demo.service.impl;

import com.example.demo.domain.User2;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int add(User2 user) {
        userMapper.insert(user);
        //age改为id
        int id = user.getId();
        return id;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int addAccount() {
        User2 user = new User2();
        user.setAge(67);
        user.setCreateTime(new Date());
        user.setName("测试事务");
        user.setPhone("1001100");
        userMapper.insert(user);
        int i = 19/0;
        return 0;
    }
}
