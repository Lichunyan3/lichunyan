package com.lcy.exception;

/**
 * @author 李春艳
 * @version 1.0
 */
public class Exception01 {
    public static int method(){
        try {
            String[] names = new String[3];
            if (names[1].equals("tom")){
                System.out.println(names[1]);
            }else {
                names[3] = "hspedu";
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        }catch (NullPointerException e){
            return 3;//应该先报空指针异常
        } finally {
            return 4;//但只能return一个值
        }
    }

    public static void main(String[] args) {
        System.out.println(method());
    }
}
