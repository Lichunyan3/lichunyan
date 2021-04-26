public class TernaryOperatorExercise{
	public static void main(String[] args){ 
		//实现三个数的最大值,目前推荐这种
		int n1 = 553;
		int n2 = 22;
		int n3 = 123;
		int max1 = n1 > n2 ? n1 : n2;
		int max2 = max1 > n3 ? max1 : n3;
		System.out.println("最大值为" + max2);
	
		//使用一条语句实现
		//后面可使用排序算法解决
		//int max = (n1 > n2 ? n1 : n2) > n3 ? 
		//			(n1 > n2 ? n1 : n2) : n3;
		//System.out.println("最大值为" + max);
		int a1 = 0b01111011;
		int a2 = 01246;
		int a3 = 0x22D0;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
	}
}