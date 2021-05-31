package com.lcy.innerclass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer01 outer01 = new Outer01();
        outer01.method();
    }
}

class Outer01{
    private int n1 = 10;
    public void method(){
        //基于接口的匿名内部类 使用A接口并创建对象
        /*
        编译类型是A
        底层会给匿名内部类分配类名Outer01$1 ->运行类型
        class Outer01$1 implements A{
            @Override
            public void cry() {
                System.out.println("老虎叫唤...");
            }
        }
         */
        A tiger = new A(){
            @Override
            public void cry() {
                System.out.println("老虎叫唤...");
            }
        };
        System.out.println("tiger的运行类型："+tiger.getClass());
        tiger.cry();

        //基于类的匿名内部类
        //编译类型Father， 运行类型Outer01$2 同时直接返回了Outer01$2的对象
        //参数列表会传递给构造器
        Father father = new Father("jack") {
            @Override
            public void test() {
                System.out.println("匿名内部类重写test方法");
            }
        };
        System.out.println("father的运行类型："+father.getClass());
        father.test();

        //基于抽象类的匿名内部类
        Animal animal = new Animal() {
            @Override
            void eat() {
                System.out.println("小狗吃骨头");
            }
        };
        animal.eat();


    }
}
interface A{
    public void cry();
}
class Father{
    public Father(String name) {
    }
    public void test(){

    }
}
abstract class Animal{
    abstract void eat();
}