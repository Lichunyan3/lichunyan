import java.util.Scanner;
public class BreakExercise01{
	public static void main(String[] args){
		//һ��1-100���ڵ�����ͣ�������͵�һ�δ���20�ĵ�ǰ��[for+break]
		int sum = 0;//��
		for(int j = 1;j <= 100;j++){
			sum += j;
			if(sum > 20){
				System.out.println(j);
				break;
			}
		}
		System.out.println(sum);

		//����ʵ�ֵ�¼��֤ �û������������ȷ����3�λ��ᣬ��������ʾ���м��λ���
		int chance = 3;//��¼����
		Scanner myScanner = new Scanner(System.in);
		String name = "";
		String password = "";
		for(int i =1;i <= 3;i++){
			System.out.println("�������û�����");
			name = myScanner.next();
			System.out.println("���������룺");
			password = myScanner.next();
			chance--;
			//�Ƚ�������û����������Ƿ���ȷ
			//����˵�����ַ����ıȽ�ʹ��equals����
			if("����".equals(name) && "666".equals(password)){
				System.out.println("��¼�ɹ�");
				break;
			} else {
				System.out.println("�㻹��" + chance + "�λ���");
			}		
		}
		
		
	}
}