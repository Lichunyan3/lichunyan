import java.util.Scanner;
public class NestedIf{
	public static void main(String[] args){
		//嵌套分支练习 
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入歌手初赛成绩：");
		double score = myScanner.nextDouble();
		
		if(score > 8.0) {
			System.out.println("恭喜！进入决赛");
			System.out.println("请输入歌手性别：");
			char gender = myScanner.next().charAt(0);//接收字符
			if(gender == '男') {
				System.out.println("进入男子组决赛");
			} else if(gender == '女'){
				System.out.println("进入女子组决赛");
			} else {
				System.out.println("性别输入错误");
			}
		} else {
			System.out.println("很遗憾，你被淘汰了");
		}
	}
}