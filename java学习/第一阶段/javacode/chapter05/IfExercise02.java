import java.util.Scanner;
public class IfExercise02{
	public static void main(String[] args){
		//多分支练习 
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入保国同志的信用分(1-100)：");
		int credit = myScanner.nextInt();
		//先对输入的信用分进行一个范围的有效判断1-100，否则提示输入错误
		if(credit >= 1 && credit <= 100) {
			if(credit == 100) {
				System.out.println("信用极好");
			} else if(credit > 80 && credit <= 90) {
				System.out.println("信用优秀");
			} else if(credit >= 60 && credit <= 80) {
				System.out.println("信用一般");
			} else {
				System.out.println("信用不及格");
			}
		} else{
			System.out.println("信用分格式错误，请重新输入");
		}
	}
}