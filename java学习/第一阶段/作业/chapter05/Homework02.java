import java.util.Scanner;
public class Homework02{
	public static void main(String[] args){
		//�ж�һ�������ķ�Χ
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������һ��������");
		int num = myScanner.nextInt();
		if(num > 0){
			System.out.println("��������0");
		} else if(num < 0){
			System.out.println("����С��0");
		} else {
			System.out.println("��������0");
		}
		
		//�ж�һ������Ƿ�������
		System.out.println("�������������");
		int year = myScanner.nextInt();
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
			System.out.println(year + "��������");
		} else {
			System.out.println(year + "�겻������");
		}
	}
}