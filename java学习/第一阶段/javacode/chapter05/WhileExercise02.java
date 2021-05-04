public class WhileExercise02{
	public static void main(String[] args){
		//while循环练习 打印40-200之间所有的偶数
		int i = 40;
		while(i <= 200){
			if(i % 2 == 0){
				System.out.println("i=" + i);
			}
			i++;
		}
	}
}