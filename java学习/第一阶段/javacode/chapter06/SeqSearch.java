import java.util.Scanner;
public class SeqSearch{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		String[] fruits = {"�㽶", "��ݮ", "����", "����", "����", "����"};
		System.out.println("����������Ҫ�ҵ�ˮ����");
		String find = myScanner.next();
		int[] index = new int[]{-1};//һ������ķ���,������ҵ������ﲻֻһ��
		int count = 0;//�ۻ�Ѱ����ĸ���
		for(int i = 0;i < fruits.length;i++){
			if(find.equals(fruits[i])){
				index[0] = i;
				count++;
				int indexNew[] = new int[count];
				indexNew[indexNew.length - 1] = i;
				index = indexNew;	
			}
		}
		for(int i = 0;i < index.length;i++){
			System.out.println("�ҵ���" + find + "������" + index[i]);
		}
		if(index[0] == -1){//˵��û���ҵ�
			System.out.println("�Բ���û�������ҵ�ˮ��-" + find);
		}
	}
}