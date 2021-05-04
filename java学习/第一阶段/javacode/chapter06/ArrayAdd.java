import java.util.Scanner;
public class ArrayAdd{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		//初始化数组
		int[] arr = {0,1,2};
		do{
			int[] arr1 = new int[arr.length + 1];
			for(int i = 0;i < arr.length;i++){
				arr1[i] = arr[i];
			}
			System.out.println("请输入你想要添加的元素：");
			int add = myScanner.nextInt();
			arr1[arr.length] = add;
			arr = arr1;
			for(int i = 0;i < arr.length;i++){
				System.out.print(arr[i] + "\t");
			} 
			System.out.println("是否继续添加元素？y/n");
			char answer = myScanner.next().charAt(0);
			if(answer == 'n'){
				System.out.println("您已停止添加元素");
				break;
			}
		} while(true);
	}
}