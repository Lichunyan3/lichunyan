package com.lcy.debug_;

public class Debug02 {
    public static void main(String[] args) {
        //演示数组越界异常
        int[] arr = {0,-1,10};
        for (int i = 0; i <= arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("退出for....");
    }
}
