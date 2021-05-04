public class Homework06{
	public static void main(String[] args){
		//求出1-1/2+1/3-1/4...+1/100的和
		double sum = 0;
		for(int i = 1;i <= 100;i++){
			double fraction = 1.0 / i;//陷阱
			if(i % 2 == 0){
				fraction *= -1;
			} 
			sum += fraction;
		}
		System.out.println("总和为：" + sum);
		
		//求1+（1+2）+（1+2+3）+...+（1+2+3+..+100）的结果
		int result = 0;
		for(int m = 1;m <= 100;m++){//m表示第几项和当前项的最后一个数
			for(int n =1;n <= m;n++){
				result += n;
			}
		}
		System.out.println("结果为：" + result);
	}
}