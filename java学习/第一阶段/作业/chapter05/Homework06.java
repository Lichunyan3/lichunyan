public class Homework06{
	public static void main(String[] args){
		//���1-1/2+1/3-1/4...+1/100�ĺ�
		double sum = 0;
		for(int i = 1;i <= 100;i++){
			double fraction = 1.0 / i;//����
			if(i % 2 == 0){
				fraction *= -1;
			} 
			sum += fraction;
		}
		System.out.println("�ܺ�Ϊ��" + sum);
		
		//��1+��1+2��+��1+2+3��+...+��1+2+3+..+100���Ľ��
		int result = 0;
		for(int m = 1;m <= 100;m++){//m��ʾ�ڼ���͵�ǰ������һ����
			for(int n =1;n <= m;n++){
				result += n;
			}
		}
		System.out.println("���Ϊ��" + result);
	}
}