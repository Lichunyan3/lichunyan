import java.util.Scanner;
public class SwitchExercise01{
	public static void main(String[] args){
		//switch分支练习 把小写字母转换成大写
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入小写字母(a-e)：");
		char zimu = myScanner.next().charAt(0);
		switch(zimu) {
			case 'a':
			System.out.println("A");
			break;
			case 'b':
			System.out.println("B");
			break;
			case 'c':
			System.out.println("C");
			break;
			case 'd':
			System.out.println("D");
			break;
			case 'e':
			System.out.println("E");
			break;
			default:
			System.out.println("你的输入有误");
		}
		
	}
}