public class DoWhileExercise01{
	public static void main(String[] args){
		//do..whileѭ����ϰ ��ӡ1-100
		//int i = 1;
		//do{
		//	System.out.println("i=" + i);
		//	i++;
		//} while(i <= 100);
		
		//����1-100�ĺ�
		int j = 1;
		int sum = 0;
		do{
			sum += j;
			j++;
		} while(j <= 100);
		System.out.println("1-100�ĺ�Ϊ" + sum);
		
		//ͳ��1-200֮���ܱ�5���������ܱ�3�����ĸ���
		int m = 1;
		int count = 0;
		do{
			if(m % 5 == 0 && m % 3 != 0){
				System.out.println("m=" + m);
				count++;
			}
			m++;
		} while(m <= 200);
		System.out.println("1-200֮���ܱ�5���������ܱ�3�����ĸ���Ϊ" + count);
	}
}