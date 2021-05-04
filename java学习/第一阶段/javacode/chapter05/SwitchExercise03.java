import java.util.Scanner;
public class SwitchExercise03{
	public static void main(String[] args){
		//switch分支练习 季节 使用穿透
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入月份(1-12)：");
		int month = myScanner.nextInt();
		if(month >= 1 && month <= 12){
			switch(month) {
				case 3:
				case 4:
				case 5:
				System.out.println("这是春季");
				break;
				case 6:
				case 7:
				case 8:
				System.out.println("这是夏季");
				break;
				case 9:
				case 10:
				case 11:
				System.out.println("这是秋季");
				break;
				case 12:
				case 1:
				case 2:
				System.out.println("这是冬季");
				break;
			}
		} else {
			System.out.println("你输入的月份不对");
		}
	}
}