public class DoWhileExercise01{
	public static void main(String[] args){
		//do..while循环练习 打印1-100
		//int i = 1;
		//do{
		//	System.out.println("i=" + i);
		//	i++;
		//} while(i <= 100);
		
		//计算1-100的和
		int j = 1;
		int sum = 0;
		do{
			sum += j;
			j++;
		} while(j <= 100);
		System.out.println("1-100的和为" + sum);
		
		//统计1-200之间能被5整除但不能被3整除的个数
		int m = 1;
		int count = 0;
		do{
			if(m % 5 == 0 && m % 3 != 0){
				System.out.println("m=" + m);
				count++;
			}
			m++;
		} while(m <= 200);
		System.out.println("1-200之间能被5整除但不能被3整除的个数为" + count);
	}
}