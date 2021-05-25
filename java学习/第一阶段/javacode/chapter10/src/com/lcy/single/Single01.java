package com.lcy.single;

public class Single01 {
    public static void main(String[] args) {
        System.out.println(GirlFriend.getInstance());
    }
}
//饿汉式
class GirlFriend{
    private String name;
    private static GirlFriend gf = new GirlFriend("jack");
    private GirlFriend(String name){
        this.name = name;
    }
    public static GirlFriend getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}