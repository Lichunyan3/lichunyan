import java.util.Scanner;
public class Homework02{
	public static void main(String[] args){
		//方法二
		Scanner myScanner = new Scanner(System.in);
		int[] arr = {10, 12, 45, 90};
		do{
			System.out.println("请输入一个整数：");
			int insertNum = myScanner.nextInt();//插入元素
			int index = -1;//判断元素定位到哪个索引
			for(int i = 0;i< arr.length;i++){
				if(insertNum <= arr[i]){//若小于某个元素则代替这个位置
					index = i;
					break;
				}
			}
			if(index == -1){//若不满足则放到数组最后面
					index = arr.length;
			}
			int[] arrNew = new int[arr.length + 1];
			for(int i = 0,j = 0;i < arrNew.length;i++){//i为arrNew的指针，j为arr的指针
				if(i != index){
					arrNew[i] = arr[j];
					j++;
				} else {
					arrNew[i] = insertNum;
				}
			}
			arr = arrNew;
			//输出插入元素后的数组
			for(int i = 0;i < arr.length;i++){
				System.out.print(arr[i] + " ");
			}
		}while(true);
	}
}