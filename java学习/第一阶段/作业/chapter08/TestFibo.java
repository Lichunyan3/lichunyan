public class TestFibo {
    public static void main(String[] args) {
        int n = 7;
        AA a = new AA(n);
        a.fibonacci(n);
        for (int i = 0; i < n; i++) {
            System.out.print(a.arr[i] + " ");
        }
    }
}
class AA{
    int[] arr;
    int f;//接收每一个斐波那契数的值
    public AA(int n){
        arr = new int[n];//创建一个长度为n的数组
    }
    public int fibonacci(int n){
        if(n > 0){
            if(n == 1 || n == 2){
                f = 1;

            } else if(n > 2) {
                f = fibonacci(n - 1) + fibonacci(n - 2);
            }
            arr[n-1] = f;
            return f;
        } else {
            System.out.println("需要输入大于0的整数");
            return -1;
        }
    }
}