public class IfExercise01{
	public static void main(String[] args){
		//����֧��ϰ 
		double a = 12;
		double b = 13;
		if(a > 10.0 && b < 20.0) {
			System.out.println("�������ĺ�=" + (a + b));
		}
		System.out.println("�������...");
		
		//˫��֧��ϰ
		int i1 = 4;
		int i2 = 6;
		int sum = i1 + i2;
		if(sum % 3 == 0 && sum % 5 == 0) {
			System.out.println("����֮�ͼ��ܱ�3���ܱ�5����");
		} else {
			System.out.println("����֮�Ͳ���ͬʱ��3�ͱ�5����");
		}
		
		//�ж�һ������Ƿ�������
		int year = 2028;
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "��������");
		} else {
			System.out.println(year + "�겻������");
		}
	}
}