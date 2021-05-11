public class RecursionExercise01{
	public static void main(String[] args){
		AA a = new AA();
		int b = a.fibonacci(7);
		System.out.println("b=" + b);
	}
}
//方法的返回类型int
//方法的名字fibonacci
//方法的形参int n
//方法体

/*
斐波那契数列
n=1 1
n=2 1
n=3 2 前两个数的和
n=4 3
n=5 5
...
*/
class AA{
	public int fibonacci(int n){
		if(n > 0){
			if(n == 1 || n == 2){
				return 1;
			} else {
				return fibonacci(n -1) + fibonacci(n - 2);
			}
		} else {
			System.out.println("你的输入有误，需要大于0的整数");
			return -1;
		}
	}
	
}