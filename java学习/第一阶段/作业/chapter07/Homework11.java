import java.util.*;
public class Homework11{
	public static void main(String[] args){
		Tom t = new Tom();
		int winTimes = 0;//最后赢的次数
		
		//创建二维数组，接收局数，tom出拳情况以及电脑出拳情况
		int[][] arr1 = new int [3][3];
		int j = 0;
		String[] arr2 = new String[3];//接收输赢情况
		
		Scanner myScanner = new Scanner(System.in);
		for(int i = 0;i < 3;i++){
			System.out.println("你想出哪个：0-石头，1-剪刀，2-布");
			int num = myScanner.nextInt();
			t.setTomGuessNum(num);
			int tomGuessNum = t.getTomGuessNum();
			arr1[i][j+1] = tomGuessNum;
			
			int comGuessNum = t.computerNum();
			arr1[i][j+2] = comGuessNum;
			arr1[i][j] = t.guess;
			String res = t.vsComputer();
			arr2[i] = res;
			
			//每局的情况进行输出
			System.out.println("==========================");
			System.out.println("局数\ttom出拳\t电脑出拳\t结果");
			System.out.println(t.guess + "\t" + tomGuessNum + "\t\t" + comGuessNum + "\t\t" + res);
			System.out.println("==========================");
			winTimes = t.winTimes(res);
			
		}
		
		//打印清单
		System.out.println("局数\ttom出拳\t电脑出拳\t结果");
		for(int i = 0;i < arr1.length;i++){
			for(int k = 0;k < arr1[i].length;k++){
				System.out.print(arr1[i][k] + "\t");
			}
			System.out.print(arr2[i]);
			System.out.println();
		}
		System.out.println("tom赢了" + winTimes + "次");
		
	}
}
class Tom{
	int tomGuessNum;//tom出拳
	int comGuessNum;//电脑出拳
	int winTimes = 0;//赢的次数
	int guess = 1;//局数
	public int computerNum(){
		Random r = new Random();
		comGuessNum = r.nextInt(3);
		return comGuessNum;//返回0-2的整数
	}
	public void setTomGuessNum(int tomGuessNum){
		if(tomGuessNum < 0 || tomGuessNum > 2){
			throw new IllegalArgumentException("数字输入有误");//抛出异常
		}
		this.tomGuessNum = tomGuessNum;
	}
	public int getTomGuessNum(){
		return tomGuessNum;
	}
	public String vsComputer(){
		if(tomGuessNum == 0 && comGuessNum == 1){
			return "tom赢";
		} else if(tomGuessNum == 1 && comGuessNum == 2){
			return "tom赢";
		}else if(tomGuessNum == 2 && comGuessNum == 0){
			return "tom赢";
		}else if(tomGuessNum == comGuessNum){
			return "平局";
		} else {
			return "tom输";
		}
	}
	
	public int winTimes(String s){
		guess++;
		if(s.equals("tom赢")){
			winTimes++;
		}
		return winTimes;
	}

}
