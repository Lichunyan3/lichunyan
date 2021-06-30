package cm.lcy.generic;

import java.util.*;

/**
 * @author 李春艳
 * @version 1.0
 */
public class GenericExercise01 {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("jack",19));
        students.add(new Student("tom",15));
        students.add(new Student("smith",23));
        for (Student student : students){
            System.out.println(student);
        }

        HashMap<String, Student> hm = new HashMap<>();
        hm.put("milan",new Student("milan",24));
        hm.put("amy",new Student("amy",21));
        hm.put("bob",new Student("bob",22));
        Set<Map.Entry<String, Student>> entries = hm.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        System.out.println("===========");
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next =  iterator.next();
            System.out.println(next.getKey()+"-"+next.getValue());
        }
    }

}
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
