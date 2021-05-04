import java.util.Scanner;
public class SwitchExercise02{
	public static void main(String[] args){
		//switch分支练习 成绩
		//需进行一个转换：编程思想
		//如果成绩在[60,100],(int)(成绩/60) = 1
		//如果成绩在[0,60),(int)(成绩/60) = 0
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入学生成绩(0-100)：");
		double score = myScanner.nextDouble();
		if(score >= 0 && score <= 100) {
			int c1 = (int)(score / 60);
			switch(c1) {
				case 0:
				System.out.println("成绩不合格");
				break;
				case 1:
				System.out.println("成绩合格");
				break;
			}
		} else {
			System.out.println("你的输入有误");
		}
	}
}