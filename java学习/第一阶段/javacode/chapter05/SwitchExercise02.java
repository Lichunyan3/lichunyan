import java.util.Scanner;
public class SwitchExercise02{
	public static void main(String[] args){
		//switch��֧��ϰ �ɼ�
		//�����һ��ת�������˼��
		//����ɼ���[60,100],(int)(�ɼ�/60) = 1
		//����ɼ���[0,60),(int)(�ɼ�/60) = 0
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������ѧ���ɼ�(0-100)��");
		double score = myScanner.nextDouble();
		if(score >= 0 && score <= 100) {
			int c1 = (int)(score / 60);
			switch(c1) {
				case 0:
				System.out.println("�ɼ����ϸ�");
				break;
				case 1:
				System.out.println("�ɼ��ϸ�");
				break;
			}
		} else {
			System.out.println("�����������");
		}
	}
}