package com.lcy.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author 李春艳
 * @version 1.0
 */
public class Properties02 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        //加载指定配置文件
        properties.load(new FileReader("src\\mysql.properties"));
        //把k-v显示在控制台
        properties.list(System.out);
        //根据key获取对应的值
        String user = properties.getProperty("user");
        System.out.println("用户名="+user);
    }
}
