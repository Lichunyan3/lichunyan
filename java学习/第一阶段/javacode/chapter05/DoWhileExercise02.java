import java.util.Scanner;
public class DoWhileExercise02{
	public static void main(String[] args){
		//1、不停的问还钱吗
		//2、使用char answer接收回答
		//3、在do-while的while判断如果是 y 就不再循环
		Scanner myScanner = new Scanner(System.in);
		char answer = ' ';
		do{
			System.out.println("使出我的五连鞭~");
			System.out.println("老韩问：还钱吗？y/n?");
			answer = myScanner.next().charAt(0);
			System.out.println("李三的回答是：" + answer);
		} while(answer != 'y');
		System.out.println("终于还钱了！");
	}
}