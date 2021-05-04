import java.util.Scanner;
public class Homework02{
	public static void main(String[] args){
		//判断一个整数的范围
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int num = myScanner.nextInt();
		if(num > 0){
			System.out.println("该数大于0");
		} else if(num < 0){
			System.out.println("该数小于0");
		} else {
			System.out.println("该数等于0");
		}
		
		//判断一个年份是否是闰年
		System.out.println("请输入年份数：");
		int year = myScanner.nextInt();
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
			System.out.println(year + "年是闰年");
		} else {
			System.out.println(year + "年不是闰年");
		}
	}
}