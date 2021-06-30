package cm.lcy.generic;

import java.util.ArrayList;

/**
 * @author 李春艳
 * @version 1.0
 */
public class Generic01 {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("小黄",1));
        dogs.add(new Dog("小花",3));
        dogs.add(new Dog("小灰",2));
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }
}
class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}