import java.util.Scanner;
public class IfExercise03{
	public static void main(String[] args){
		//Ƕ�׷�֧��ϰ 
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�����뵱ǰ�·ݣ�");
		int month = myScanner.nextInt();
		System.out.println("�������ο����䣺");
		int age = myScanner.nextInt();
		if(month >= 4 && month <= 10){
			System.out.println("Ŀǰʵʩ����Ʊ��");
			if(age >= 18 && age <= 60){
				System.out.println("����Ʊ��Ϊ60");
			} else if(age <18) {
				System.out.println("��ͯƱ��Ϊ" + (60 / 2));
			} else if(age > 60){
				System.out.println("����Ʊ��Ϊ" + (60 / 3));
			}
		} else {
			System.out.println("Ŀǰʵʩ����Ʊ��");
			if(age >= 18 && age <= 60){
				System.out.println("����Ʊ��Ϊ40");
			} else {
				System.out.println("Ʊ��Ϊ20");
			}
		}
	}
}