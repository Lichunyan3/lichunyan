package com.lcy.houserent.service;

import com.lcy.houserent.domain.House;

/**
 * 定义House[]，保存House对象
 * 响应HouseView的调用
 * 完成对房屋信息的各种操作（增删改查crud） [业务层]
 */
public class HouseService {
    private House[] houses = null;
    private int houseNums = 1;
    private int idNum = 1;

    public HouseService(int size) {
        houses = new House[size];
        houses[0] = new House(1,"jack","111","海淀区",2000,"未出租");
    }

    //根据id查找房屋
    public House findById(int id){
        for (int i = 0; i < houseNums; i++) {
            if(id == houses[i].getId()){
               return houses[i];
            }
        }
       return null;
    }

    //删除房屋信息
    public boolean del(int delId){
        //先要找到删除的房屋信息对应的下标
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if(delId == houses[i].getId()){
                index = i;
            }
        }
        if(index == -1){
            return false;
        }
        //找到了则替换，最后一个元素置空
        for (int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i+1];
        }
        houses[houseNums-1] = null;
        houseNums--;
        return true;
    }

    //添加房屋信息
    public boolean add(House newHouse){
        if(houseNums == houses.length){
            House[] newHouses = new House[houses.length+1];
            //数组扩容
            for (int i = 0; i < houses.length; i++) {
                newHouses[i] = houses[i];
            }
            newHouses[houses.length] = newHouse;
            houses = newHouses;
            return true;
        }
        houses[houseNums++] = newHouse;
        idNum++;
        newHouse.setId(idNum);
        return true;
    }

    //返回房屋列表
    public House[] list(){
        return houses;
    }
}
