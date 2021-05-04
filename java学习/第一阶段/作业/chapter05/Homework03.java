import java.util.Scanner;
public class Homework03{
	public static void main(String[] args){
		//判断一个整数是否是水仙花数 水仙花数是指一个3位数，其各个位上数字立方和等于其本身
		//百位=n/100 十位=n%100/10 个位=n%10
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个三位数的整数：");
		int num = myScanner.nextInt();
		int bai = num / 100;
		int shi = num % 100 /10;
		int ge = num % 10;
		if((bai * bai * bai + shi * shi * shi + ge * ge * ge) == num){
			System.out.println(num + "是水仙花数");
		} else {
			System.out.println(num + "不是水仙花数");
		}
	}
}