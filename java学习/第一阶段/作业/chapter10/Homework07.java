package com.lcy.homework;

/**
 * @author 李春艳
 * @version 1.0
 */
public class Homework07 {
    public static void main(String[] args) {
        Color color = Color.BLUE;
        color.show();
        switch (color){
            case RED:
                System.out.println("匹配到红色");
                break;
            case BLUE:
                System.out.println("匹配到蓝色");
                break;
            case BLACK:
                System.out.println("匹配到黑色");
                break;
            case GREEN:
                System.out.println("匹配到绿色");
                break;
            case YELLOW:
                System.out.println("匹配到黄色");
                break;
            default:
                System.out.println("对不起，没有你想找的颜色");
        }
    }

}
enum Color implements IC{
    RED(255,0,0),BLUE(0,0,255),
    BLACK(0,0,0),YELLOW(255,25,0),
    GREEN(0,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("属性值为："+redValue+","+greenValue+","+blueValue);
    }
}
interface IC{
    void show();
}
