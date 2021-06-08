package com.lcy.exception;

/**
 * @author 李春艳
 * @version 1.0
 */
public class Exception02 {
    public static int method(){
        int i = 1;
        try {
            i++;
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
            return ++i;//应该先报空指针异常 i=3.保存临时变量temp=3
        } finally {
            ++i;//i=4
            System.out.println("i=" + i);
        }
    }

    public static void main(String[] args) {
        System.out.println(method());
    }
}
