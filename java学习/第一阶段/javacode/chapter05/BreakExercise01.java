import java.util.Scanner;
public class BreakExercise01{
	public static void main(String[] args){
		//一、1-100以内的数求和，求出当和第一次大于20的当前数[for+break]
		int sum = 0;//和
		for(int j = 1;j <= 100;j++){
			sum += j;
			if(sum > 20){
				System.out.println(j);
				break;
			}
		}
		System.out.println(sum);

		//二、实现登录验证 用户名、密码均正确，共3次机会，若错误，提示还有几次机会
		int chance = 3;//登录机会
		Scanner myScanner = new Scanner(System.in);
		String name = "";
		String password = "";
		for(int i =1;i <= 3;i++){
			System.out.println("请输入用户名：");
			name = myScanner.next();
			System.out.println("请输入密码：");
			password = myScanner.next();
			chance--;
			//比较输入的用户名和密码是否正确
			//补充说明：字符串的比较使用equals方法
			if("丁真".equals(name) && "666".equals(password)){
				System.out.println("登录成功");
				break;
			} else {
				System.out.println("你还有" + chance + "次机会");
			}		
		}
		
		
	}
}