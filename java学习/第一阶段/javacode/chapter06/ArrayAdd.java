import java.util.Scanner;
public class ArrayAdd{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		//��ʼ������
		int[] arr = {0,1,2};
		do{
			int[] arr1 = new int[arr.length + 1];
			for(int i = 0;i < arr.length;i++){
				arr1[i] = arr[i];
			}
			System.out.println("����������Ҫ��ӵ�Ԫ�أ�");
			int add = myScanner.nextInt();
			arr1[arr.length] = add;
			arr = arr1;
			for(int i = 0;i < arr.length;i++){
				System.out.print(arr[i] + "\t");
			} 
			System.out.println("�Ƿ�������Ԫ�أ�y/n");
			char answer = myScanner.next().charAt(0);
			if(answer == 'n'){
				System.out.println("����ֹͣ���Ԫ��");
				break;
			}
		} while(true);
	}
}