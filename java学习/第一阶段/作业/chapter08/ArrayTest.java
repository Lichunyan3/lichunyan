public class ArrayTest {
    public static void main(String[] args) {
        MyTools m = new MyTools();
        int[] arr = {34, 13, 45, 35, 89, 27};
        m.bubble(arr);
    }

}

//当我们run一个文件时，会先编译成.class,再运行
class MyTools {

    public void bubble(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //打印排序好的数组元素
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}