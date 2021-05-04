public class WhileExercise01{
	public static void main(String[] args){
		//while循环练习 打印1-100之间所有是3的倍数的整数
		int i = 1;
		while(i <= 100){
			if(i % 3 == 0){
				System.out.println("i=" + i);
			}
			i++;
		}		
	}
}