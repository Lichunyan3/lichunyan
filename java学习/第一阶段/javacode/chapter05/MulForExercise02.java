public class MulForExercise02{
	public static void main(String[] args){
		//九九乘法表
		//for(int i = 1;i <= 9;i++){
		//	for(int j = 1;j <= i;j++){
		//		System.out.print(j + "*" + i + "=" + (i * j) + "\t");
		//	}
		//	System.out.println();
		//}
		
		//经典的打印金字塔
		/*
			1、先打印一个矩形
			* * * * * 
			* * * * * 
			* * * * * 
			* * * * * 
			* * * * *
			2、打印半个金字塔
			*  
			* * 
			* * *  
			* * * * 
			* * * * *
			3、打印整个金字塔
					*          //第一层有1个*， 2*1-1，有4=（总层数-1）个空格
				  * * * 	   //第二层有3个*， 2*2-1，有3=（总层数-2）个空格
				* * * * *      ...
			  * * * * * * * 
			* * * * * * * * *
			4、打印空心金字塔
					*          //第一层有1个* 
				  *   * 	   //第二层有2个*，该行的第一个位置是*，最后一个位置也是* 
				*       *      ...
			  *           * 
			* * * * * * * * *  //第五层有9个*
			层数作成变量totalLevel
			拓展题：打印一个菱形？
		*/
		int totalLevel = 9;
		for(int i =1;i <= totalLevel;i++){//i表示层数
		//输出*之前，还要输出对应空格 总层数-当前层
			for(int k = 1;k <= totalLevel - i;k++){
				System.out.print("  ");
			}
			for(int j =1;j <= 2 * i - 1;j++){
				if(j == 1 || j == 2 * i - 1 || i == totalLevel){
					System.out.print("*" + " ");
				} else {
					System.out.print("  ");
				}
			}
			//每打印一层后换行
			System.out.println();
		}
	}
}