public class RecursionExercise02{
	public static void main(String[] args){
		AA a = new AA();
		int n = 8;
		int b = a.peach(n);
		if(b != -1){
			System.out.println("��" + n + "����" + b + "������");
		}
	}
}
/*�����
day10 ��1������
day9   ��day10+1��*2
day8   ��day9+1��*2
*/
class AA{
	public int peach(int n){
		if(n == 10){
			return 1;
		} else if(n >= 1 && n <=9){
			return (peach(n+1) + 1) * 2;
		} else {
			System.out.println("nֻ����1-10");
			return -1;
		}
	}
	
}