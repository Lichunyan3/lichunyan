public class Homework01{
	public static void main(String[] args){
		int interChange = 0;//统计经过的路口数
		double money = 100000;
		while(money >= 0){
			if(money > 50000){//现金大于5万每次交5%
				//money = money - money * 0.05;
				money *= 0.95;
			} else if(money >= 1000 && money <= 50000) {//1000-50000每次交1000
				money -= 1000;
			} else {//小于1000
				break;
			}
			interChange++;
		}
		System.out.println("该人可以经过" + interChange + "个路口");
	}
}