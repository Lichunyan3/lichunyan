package com.lcy.arrays;

import java.util.Arrays;
import java.util.List;

/**
 * @author 李春艳
 * @version 1.0
 */
public class ArraysMethod02 {
    public static void main(String[] args) {
        Integer[] arr = {1,45,244,987};
//        System.out.println(Arrays.toString(arr));
        //binarySearch通过二分搜索查找，要求必须有序
        //如果不存在，返回-（low+1），low代表它应该存放的位置
        int i = Arrays.binarySearch(arr,87);
        System.out.println("index = " + i);

        //copyOf数组元素的复制
        //1、从arr数组中拷贝arr.length个元素到newArr数组中
        //2、如果拷贝的长度>arr.length就在数组的后面增加null
        //3、如果拷贝长度小于0就抛出异常NegativeArraySizeException
        Integer[] newArr = Arrays.copyOf(arr, arr.length);

        //fill数组的填充
        Integer[] num = {9,3,2};
        //用99区填充num数组，即替换原来的数
        Arrays.fill(num,99);
        System.out.println(Arrays.toString(num));

        //equals比较两个数组元素内容是否完全一致
        Integer[] num1 = {1,45,987,244};
        //比较arr和num1，两个数组元素一样就返回true
        boolean equals = Arrays.equals(arr, num1);
        System.out.println(equals);

        //asList将一组值，转为list集合
        List<Integer> asList = Arrays.asList(2, 3, 45, 56, 2, 2);
        System.out.println(asList);
        System.out.println("asList的运行类型"+asList.getClass());


    }
}
