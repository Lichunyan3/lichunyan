import java.util.Scanner;
public class IfExercise02{
	public static void main(String[] args){
		//���֧��ϰ 
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�����뱣��ͬ־�����÷�(1-100)��");
		int credit = myScanner.nextInt();
		//�ȶ���������÷ֽ���һ����Χ����Ч�ж�1-100��������ʾ�������
		if(credit >= 1 && credit <= 100) {
			if(credit == 100) {
				System.out.println("���ü���");
			} else if(credit > 80 && credit <= 90) {
				System.out.println("��������");
			} else if(credit >= 60 && credit <= 80) {
				System.out.println("����һ��");
			} else {
				System.out.println("���ò�����");
			}
		} else{
			System.out.println("���÷ָ�ʽ��������������");
		}
	}
}