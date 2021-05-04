public class ForExercise01{
	public static void main(String[] args){
		//for循环练习 打印1-100之间所有是9的倍数的整数，统计个数及总和
		//编程思想（技巧）
		//化繁为简：将复杂的需求拆解成简单的需求，逐步完成
		//先死后活：先考虑固定的值，然后转成可以灵活变化的值
		//1、完成输出1-100的值
		//2、在输出的过程中，进行过滤，只输出9的倍数
		//3、统计个数，定义一个变量，；当满足条件时count++
		//4、总和 定义一个变量，当条件满足时累积sum += i
		
		//1、为了适应更好的需求，把范围的开始值和结束的值 作出变量
		//2、还可以更进一步，9 倍数也做成变量
		int count = 0;
		int sum = 0;
		int start = 1;
		int end = 10;
		int beishu = 4;
		for(int i = start; i <= end; i++){
			if(i % beishu == 0){
				System.out.println("i=" + i);
				count++;
				sum += i;	
			}
		}
		System.out.println("count=" + count + ",sum=" + sum);
		
	}
}