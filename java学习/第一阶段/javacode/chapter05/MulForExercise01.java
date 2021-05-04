import java.util.Scanner;
public class MulForExercise01{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		double total_score = 0;//累积所有学生的总分
		int count = 0;//累积及格人数
		int classNum = 3;//班级个数
		int stuNum = 2;//学生人数
		for(int i = 0;i < classNum;i++){//i为班级
			double sum = 0;//一个班级的总成绩
			for(int j = 0;j < stuNum;j++){//j为学生
				System.out.println("请输入学生成绩：");
				double score = myScanner.nextDouble();
				sum += score;
				if(score >= 60){//当分数大于60为及格
					count++;
				}
			}
			double mean_score = sum / stuNum;
			System.out.println("该班的平均分为" + mean_score);
			total_score += sum;
		}
		System.out.println("所有班级的平均分为" + total_score / (classNum * stuNum));
		System.out.println("所有班级的及格人数为" + count);
	}
}