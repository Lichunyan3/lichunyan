public class ArithmeticOperatorExercise02{
	public static void main(String[] args){
		//���绹��59��ż٣��ʣ���xx��������xx��
		int days = 59;
		int leftDays = days % 7;
		int weeks = days / 7;
		System.out.println(days + "�� ��" + weeks + "��������" + leftDays + "��");
		
		//����һ���������滪���¶ȣ���������¶ȶ�Ӧ�������¶�[234.5] ��ʽ��5/9*(�����¶�-100)
		//������ѧ��ʽ��java���Ե�����
		double temp = 234.5;
		double c =  (5.0 / 9) * (temp - 100);
		System.out.println(c);
	}
}