import java.util.Scanner;
public class Homework03{
	public static void main(String[] args){
		//�ж�һ�������Ƿ���ˮ�ɻ��� ˮ�ɻ�����ָһ��3λ���������λ�����������͵����䱾��
		//��λ=n/100 ʮλ=n%100/10 ��λ=n%10
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������һ����λ����������");
		int num = myScanner.nextInt();
		int bai = num / 100;
		int shi = num % 100 /10;
		int ge = num % 10;
		if((bai * bai * bai + shi * shi * shi + ge * ge * ge) == num){
			System.out.println(num + "��ˮ�ɻ���");
		} else {
			System.out.println(num + "����ˮ�ɻ���");
		}
	}
}