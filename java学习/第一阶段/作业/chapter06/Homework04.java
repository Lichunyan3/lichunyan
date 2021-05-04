public class Homework04{
	public static void main(String[] args){
		//冒泡排序代码
		int[] arr = {89,56,78,23,45,99,-2};
		int temp = 0;
		for(int i = 0;i < arr.length - 1;i++){//比较轮数
			for(int j = 0;j < arr.length - 1 - i;j++){//每轮比较次数
				if(arr[j] < arr[j+1]){//从小到大排序 若从大到小将>改为<即可
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}	
			}
		}
		System.out.println("===排序后===");
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	}
}