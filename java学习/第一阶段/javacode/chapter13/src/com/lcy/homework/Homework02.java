package com.lcy.homework;


/**
 * @author 李春艳
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        User user = new User();
        try {
            user.setName("lisa");
            user.setPassword("123467");
            user.setEmail("li@re.com");
            System.out.println("恭喜，注册成功！");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class User {
    private String name;
    private String password;
    private String email;

    public User(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!(name.length() == 2 || name.length() == 3 || name.length() == 4)) {
            throw new RuntimeException("姓名长度不正确");
        }
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (!(password.length() == 6 && isDigital(password))) {
            throw new RuntimeException("密码长度应为6，并且全是数字");
        }
        this.password = password;
    }

    public boolean isDigital(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        int i = email.indexOf("@");
        int j = email.indexOf(".");
        if (!(i > 0 && i < j)) {
            throw new RuntimeException("邮箱中包含@和. 并且@在.的前面");
        }
        this.email = email;
    }
}
