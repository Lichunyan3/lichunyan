package com.lcy.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author 李春艳
 * @version 1.0
 */
public class Properties03 {
    public static void main(String[] args) throws IOException {
        //创建配置文件，修改配置文件内容
        Properties properties = new Properties();
        properties.setProperty("charset","utf8");
        properties.setProperty("user","汤姆");
        properties.setProperty("pwd","123456");
        properties.store(new FileOutputStream("src\\mysql2.properties"),null);
        System.out.println("保存配置文件成功！");
    }
}
