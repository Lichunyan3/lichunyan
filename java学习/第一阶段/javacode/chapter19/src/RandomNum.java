/**
 * @author 李春艳
 * @version 1.0
 * 编写程序：线程a 每隔两秒向文件test.txt 中追加1 个随机数，线程b 实时将test.txt 中新添加的数字打印到控制台
 */
public class RandomNum {
    public static void main(String[] args) {
        new A().start();
        new B().start();
    }
}
