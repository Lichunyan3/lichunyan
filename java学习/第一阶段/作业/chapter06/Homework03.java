public class Homework03{
	public static void main(String[] args){
		int[] arr = new int[10];
		double sum = 0;
		int max = arr[0];
		int maxIndex = 0;
		int index = -1;
		for(int i = 0;i < arr.length;i++){
			arr[i] = (int)(Math.random() * 100) + 1;//随机生成10个1-100的整数
			sum += arr[i];
		}
		//倒序打印
		for(int i = arr.length - 1;i >= 0;i--){
			System.out.print(arr[i] + " ");
		}
		//求平均值、最大值及其下标
		double avg = sum / arr.length;
		System.out.println("\n" + "平均值为" + avg);
		for(int i = 1;i < arr.length;i++){
			if(max < arr[i]){
				max = arr[i];
				maxIndex = i;
			}
		}
		System.out.println("最大值为" + max + "，最大值的索引为" + maxIndex);
		//查询是否有8
		int findNum = 8;
		for(int i = 0;i < arr.length;i++){
			if(findNum == arr[i]){
				index = i;
				System.out.println("已找到8，其下标为：" + index);
				break;
			}
		}
		if(index == -1){
			System.out.println("数组中没有" + findNum + "这个元素");
		}
	}
}