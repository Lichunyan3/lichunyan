public class IfExercise01{
	public static void main(String[] args){
		//单分支练习 
		double a = 12;
		double b = 13;
		if(a > 10.0 && b < 20.0) {
			System.out.println("两个数的和=" + (a + b));
		}
		System.out.println("程序继续...");
		
		//双分支练习
		int i1 = 4;
		int i2 = 6;
		int sum = i1 + i2;
		if(sum % 3 == 0 && sum % 5 == 0) {
			System.out.println("两数之和既能被3又能被5整除");
		} else {
			System.out.println("两数之和不能同时被3和被5整除");
		}
		
		//判断一个年份是否是闰年
		int year = 2028;
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "年是闰年");
		} else {
			System.out.println(year + "年不是闰年");
		}
	}
}