public class BubbleSort{
	//冒泡排序
	public static void main(String[] args){
		int[] arr = {24, 69, 80, 57, 13, -3, 89, 78};
		int temp;//存放较小的那个数
		for(int i = arr.length - 1; i > 0;i--){//进行（数组长度-1）轮排序
			for(int j = 0;j < i;j++){//进行元素大小比较，每轮比较次数减1
				if(arr[j] > arr[j + 1]){
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i] + "\t");
		}
	}
}