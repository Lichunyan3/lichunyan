import java.util.Scanner;
public class Homework01{
	public static void main(String[] args){
		//方法一
		Scanner myScanner = new Scanner(System.in);
		int[] arr = {10, 12, 45, 90};
		int temp = 0;
		do{
			System.out.println("请输入一个整数：");
			int num = myScanner.nextInt();
			int[] arr1 = new int[arr.length + 1];
			for(int i = 0;i < arr.length;i++){
				arr1[i] = arr[i];
				arr1[arr.length] = num;
			}
			arr = arr1;//数组扩容
			for(int i = arr.length - 1;i > 0;i--){//排序
				if(arr[i] < arr[i - 1]){
					temp = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = temp;
				}
			}
			//输出插入元素后的升序数组
			for(int i = 0;i < arr.length;i++){
				System.out.print(arr[i] + " ");
			}
			System.out.println("还想继续插入元素吗？y/n");
			char answer = myScanner.next().charAt(0);
			if(answer == 'n'){
				break;
			}
		} while(true);
		System.out.println("结束..");
	}
}