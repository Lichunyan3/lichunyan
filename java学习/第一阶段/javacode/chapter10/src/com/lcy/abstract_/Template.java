package com.lcy.abstract_;

abstract public class Template {//抽象类-模板设计模式
    public abstract void job();
    public void calculateTime(){
        long start = System.currentTimeMillis();
        job();//动态绑定
        long end = System.currentTimeMillis();
        System.out.println("执行时间：" + (end - start));
    }
}

class AA extends Template{
    //计算任务
    public void job() {//实现父类的抽象方法
        long num = 0;
        for (int i = 1; i <= 10000; i++) {
            num += i;
        }
    }
}
class BB extends Template{
    //计算任务
    public void job() {//实现父类的抽象方法
        long num = 0;
        for (int i = 1; i <= 10000; i++) {
            num -= i;
        }
    }
}
