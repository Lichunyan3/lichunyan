import java.util.Scanner;//��ʾ��java.util�µ�Scanner��(���ı�ɨ����)����
public class Input{
	public static void main(String[] args){ 
	//��ʾ�����û�������
	//����
	//1�����롢����Scanner�����ڵİ�
	//2������Scanner����,new ����һ������
	//myScanner����Scanner��Ķ���
	Scanner myScanner = new Scanner(System.in);
	//3�������û������룬ʹ����صķ���
	System.out.println("����������");
	String name = myScanner.next();//�����û������ַ���
	System.out.println("����������");
	int age = myScanner.nextInt();//�����û�����int
	System.out.println("������нˮ");
	double salary = myScanner.nextDouble();//�����û�����double
	System.out.println("�˵���Ϣ���£�");
	System.out.println("����=" + name + ",����=" + age +",нˮ=" + salary);
	}
}