import java.util.Scanner;
public class IfExercise03{
	public static void main(String[] args){
		//嵌套分支练习 
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入当前月份：");
		int month = myScanner.nextInt();
		System.out.println("请输入游客年龄：");
		int age = myScanner.nextInt();
		if(month >= 4 && month <= 10){
			System.out.println("目前实施旺季票价");
			if(age >= 18 && age <= 60){
				System.out.println("成人票价为60");
			} else if(age <18) {
				System.out.println("儿童票价为" + (60 / 2));
			} else if(age > 60){
				System.out.println("老人票价为" + (60 / 3));
			}
		} else {
			System.out.println("目前实施淡季票价");
			if(age >= 18 && age <= 60){
				System.out.println("成人票价为40");
			} else {
				System.out.println("票价为20");
			}
		}
	}
}