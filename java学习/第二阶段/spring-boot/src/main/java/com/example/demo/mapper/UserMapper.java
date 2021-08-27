package com.example.demo.mapper;

import com.example.demo.domain.User2;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface UserMapper {

    @Insert("insert into user(name,phone,create_time,age) values(#{name},#{phone},#{createTime},#{age})")
    @Options(useGeneratedKeys = true,keyProperty = "id")//,keyColumn = "id"
    int insert(User2 user);

    @Select("select * from user")
    @Results({
            @Result(column = "create_time",property = "createTime")
    })
    List<User2> getAll();

    @Select("select * from user where id = #{id}")
    @Results({
            @Result(column = "create_time",property = "createTime")
    })
    User2 findById(Long id);

    @Update("update user set name=#{name} where id=#{id}")
    void update(User2 user);

    @Delete("delete from user where id=#{userId}")
    void delete(int userId);
}
