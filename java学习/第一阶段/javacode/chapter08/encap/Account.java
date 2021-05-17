package com.lcy.encap;

public class Account {
    private String name;
    private double leftMoney;//balance
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //长度为2、3、4位
        if(name.length() == 2 || name.length() == 3 || name.length() == 4){
            this.name = name;
        }else{
            System.out.println("你输入的名字有误，默认为佚名");
            this.name = "佚名";
        }
    }

    public double getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(double leftMoney) {
        if(leftMoney > 20) {
            this.leftMoney = leftMoney;
        }else {
            System.out.println("余额必须大于20！");
            this.leftMoney = 0;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        //密码必须是6位
        if(password.length() == 6) {
            this.password = password;
        }else {
            System.out.println("密码是六位数");
            this.password = "123456";
        }
    }

    public String info(){
        return "账户信息为name="+name+"余额："+leftMoney+"密码："+password;
    }
}
