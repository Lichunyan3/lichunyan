import java.util.Scanner;
public class DoWhileExercise02{
	public static void main(String[] args){
		//1����ͣ���ʻ�Ǯ��
		//2��ʹ��char answer���ջش�
		//3����do-while��while�ж������ y �Ͳ���ѭ��
		Scanner myScanner = new Scanner(System.in);
		char answer = ' ';
		do{
			System.out.println("ʹ���ҵ�������~");
			System.out.println("�Ϻ��ʣ���Ǯ��y/n?");
			answer = myScanner.next().charAt(0);
			System.out.println("�����Ļش��ǣ�" + answer);
		} while(answer != 'y');
		System.out.println("���ڻ�Ǯ�ˣ�");
	}
}