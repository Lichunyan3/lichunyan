import java.util.Scanner;
public class NestedIf{
	public static void main(String[] args){
		//Ƕ�׷�֧��ϰ 
		Scanner myScanner = new Scanner(System.in);
		System.out.println("��������ֳ����ɼ���");
		double score = myScanner.nextDouble();
		
		if(score > 8.0) {
			System.out.println("��ϲ���������");
			System.out.println("����������Ա�");
			char gender = myScanner.next().charAt(0);//�����ַ�
			if(gender == '��') {
				System.out.println("�������������");
			} else if(gender == 'Ů'){
				System.out.println("����Ů�������");
			} else {
				System.out.println("�Ա��������");
			}
		} else {
			System.out.println("���ź����㱻��̭��");
		}
	}
}