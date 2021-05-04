import java.util.Scanner;
public class ArrayReduce{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		//初始化数组
		int[] arr = {1, 2, 3, 4, 5};
		do{
			int[] arr1 = new int[arr.length - 1];
			for(int i = 0;i < arr.length - 1;i++){
				arr1[i] = arr[i];
			}
			arr = arr1;
			//看看缩减后的效果
			for(int i = 0;i < arr.length;i++){
				System.out.print(arr[i] + "\t");
			} 
			System.out.println("是否继续删除元素？y/n");
			char answer = myScanner.next().charAt(0);
			if(answer == 'n'){
				System.out.println("您已停止缩减元素");
				break;
			}
			if(arr.length == 1){
				System.out.println("数组仅剩最后一个元素，不能再缩减");
				break;
			}
		} while(true);
	}
}