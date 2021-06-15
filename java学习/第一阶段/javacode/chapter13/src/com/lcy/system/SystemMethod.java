package com.lcy.system;

import java.util.Arrays;

/**
 * @author 李春艳
 * @version 1.0
 */
public class SystemMethod {
    public static void main(String[] args) {
//        System.out.println("ok1");
//        //exit(0)表示程序退出 0表示应该正常的状态
//        System.exit(0);
//        System.out.println("ok2");
        int[] src ={1,2,3};
        int[] dest = new int[3];
        System.arraycopy(src,0,dest,1,2);
        System.out.println("dest="+ Arrays.toString(dest));
        System.out.println(System.currentTimeMillis());
    }
}
