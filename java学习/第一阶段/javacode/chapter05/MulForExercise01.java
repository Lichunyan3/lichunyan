import java.util.Scanner;
public class MulForExercise01{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		double total_score = 0;//�ۻ�����ѧ�����ܷ�
		int count = 0;//�ۻ���������
		int classNum = 3;//�༶����
		int stuNum = 2;//ѧ������
		for(int i = 0;i < classNum;i++){//iΪ�༶
			double sum = 0;//һ���༶���ܳɼ�
			for(int j = 0;j < stuNum;j++){//jΪѧ��
				System.out.println("������ѧ���ɼ���");
				double score = myScanner.nextDouble();
				sum += score;
				if(score >= 60){//����������60Ϊ����
					count++;
				}
			}
			double mean_score = sum / stuNum;
			System.out.println("�ð��ƽ����Ϊ" + mean_score);
			total_score += sum;
		}
		System.out.println("���а༶��ƽ����Ϊ" + total_score / (classNum * stuNum));
		System.out.println("���а༶�ļ�������Ϊ" + count);
	}
}