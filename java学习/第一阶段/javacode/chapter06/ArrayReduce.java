import java.util.Scanner;
public class ArrayReduce{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		//��ʼ������
		int[] arr = {1, 2, 3, 4, 5};
		do{
			int[] arr1 = new int[arr.length - 1];
			for(int i = 0;i < arr.length - 1;i++){
				arr1[i] = arr[i];
			}
			arr = arr1;
			//�����������Ч��
			for(int i = 0;i < arr.length;i++){
				System.out.print(arr[i] + "\t");
			} 
			System.out.println("�Ƿ����ɾ��Ԫ�أ�y/n");
			char answer = myScanner.next().charAt(0);
			if(answer == 'n'){
				System.out.println("����ֹͣ����Ԫ��");
				break;
			}
			if(arr.length == 1){
				System.out.println("�����ʣ���һ��Ԫ�أ�����������");
				break;
			}
		} while(true);
	}
}