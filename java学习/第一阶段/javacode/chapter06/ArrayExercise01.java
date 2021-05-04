public class ArrayExercise01{
	public static void main(String[] args){
		//char类型的数组，放置‘A-Z’
		char[] alphabet = new char[26];
		for(int i = 0;i < alphabet.length;i++){
			alphabet[i] = (char)('A' + i);
			System.out.print(alphabet[i] + " ");
		}
		
		System.out.println();
		//求出一个数组的最大值{4,-1,9,10,23},并得到对应的下标
		int[] num = {4,-1,9,10,23};
		int max = num[0];//假定第一个数是最大值
		int maxIndex = 0;
		for(int i = 1;i < num.length;i++){
			if(num[i] > max){
				max = num[i];
				maxIndex = i;
			}
		}
		System.out.println("最大值为" + max + ",对应的下标为" + maxIndex);
		
		//数组反转
		int temp;
		int[] arr = {11,22,33,44,55,66};
		for(int i = 0;i < arr.length / 2;i++){//对称交换
			temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i] + "\t");
		}
		
		System.out.println();
		//数组反转，使用逆序赋值的方式
		int[] arr1 = {67,56,45,89,56};
		int[] arr2 = new int[arr1.length];//创建一个新的数组
		for(int i = arr1.length - 1;i >= 0;i--){//逆序遍历
			arr2[arr1.length - 1 - i] = arr1[i];
		}
		arr1 = arr2;
		for(int i = 0;i < arr1.length;i++){
			System.out.print(arr1[i] + "\t");
		}
	}
}