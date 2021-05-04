public class ForExercise02{
	public static void main(String[] args){
		//for循环练习 打印0+5=5 1+4=5 2+3=5...
		//1、输出0-5
		//2、后面的+是5-i
		
		//1、5替换成变量
		int j = 5;
		for(int i = 1; i <= j; i++){	
			System.out.println(i + "+" + (j-i) + "=" + j);
		}
	}
}