public class ArithmeticOperator{
	public static void main(String[] args){
		// /ʹ��
		System.out.println(10 / 4);//2
		System.out.println(10.0 / 4);//2.5
		double d = 10 / 4;
		System.out.println(d);//2.0
		
		// %ȡģ��ȡ�� 
		//���� a % b = a - a / b * b
		System.out.println(10 % 3);//1
		System.out.println(-10 % 3);//-1
		System.out.println(10 % -3);//1
		System.out.println(-10 % -3);//-1
		
		// ++��ʹ��
		int i = 10;
		i++;//�������ȼ��� i = i +1;
		++i;//�������ȼ��� i = i +1;
		System.out.println("i = " + i);//11
		/*
		��Ϊ���ʽʹ��
		ǰ++��++i��������ֵ
		��++��++i�ȸ�ֵ������
		*/
		int j = 8;
		int k = ++j;//j=j+1;k=j;
		System.out.println("k = " + k + "j = " + j);//9;9
		int m = j++;//m=j;j=j+1;
		System.out.println("m = " + m + "j = " + j);//9;10
	}
}