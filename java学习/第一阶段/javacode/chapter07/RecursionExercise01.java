public class RecursionExercise01{
	public static void main(String[] args){
		AA a = new AA();
		int b = a.fibonacci(7);
		System.out.println("b=" + b);
	}
}
//�����ķ�������int
//����������fibonacci
//�������β�int n
//������

/*
쳲���������
n=1 1
n=2 1
n=3 2 ǰ�������ĺ�
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
			System.out.println("�������������Ҫ����0������");
			return -1;
		}
	}
	
}