package cm.lcy.homework;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author 李春艳
 * @version 1.0
 */
public class DAO<T> {
    private Map<String,T> map = new HashMap<>() ;
    @Test
    public void testList(){
        DAO<User> userDAO = new DAO<>();
        userDAO.save("1",new User(1,14,"jack"));
        userDAO.save("2",new User(2,15,"amy"));
        userDAO.save("3",new User(3,12,"king"));
        List<User> list = userDAO.list();
        System.out.println("list="+list);
        userDAO.update("2",new User(2,45,"bob"));
        userDAO.delete("3");
        System.out.println("=====修改后=====");
        list = userDAO.list();
        System.out.println("list=" +list);
        System.out.println("id=2 "+userDAO.get("2"));
    }
    public T get(String id){
        return map.get(id);
    }

    public void update(String id,T entity){
        map.put(id,entity);
    }

    public List<T> list(){
        List<T> list = new ArrayList<>();
        Set<String> set = map.keySet();
        for (String key:set){
            list.add(map.get(key));
        }
        return list;
    }
    public void delete(String id){
        map.remove(id);
    }
    public void save(String id,T entity){
        map.put(id,entity);
    }


}
class User{
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}