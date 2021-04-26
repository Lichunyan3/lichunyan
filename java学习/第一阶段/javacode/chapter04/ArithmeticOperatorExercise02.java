public class ArithmeticOperatorExercise02{
	public static void main(String[] args){
		//假如还有59天放假，问：合xx个星期零xx天
		int days = 59;
		int leftDays = days % 7;
		int weeks = days / 7;
		System.out.println(days + "天 合" + weeks + "个星期零" + leftDays + "天");
		
		//定义一个变量保存华氏温度，求出华氏温度对应的摄氏温度[234.5] 公式：5/9*(华氏温度-100)
		//考虑数学公式合java语言的特性
		double temp = 234.5;
		double c =  (5.0 / 9) * (temp - 100);
		System.out.println(c);
	}
}