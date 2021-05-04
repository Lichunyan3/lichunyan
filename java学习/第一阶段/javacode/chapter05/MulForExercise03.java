public class MulForExercise03{
	public static void main(String[] args){
		int totalLevel = 11;//先死后活
		//首先把菱形看成上下，上五下四，第一个for有5次，第二个for有4次
		for(int i =1;i <= totalLevel / 2 + 1;i++){//i表示层数
		//输出*之前，还要输出对应空格 总层数-当前层
			for(int k = 1;k <= (totalLevel / 2 + 1) - i;k++){
				System.out.print("  ");
			}
			for(int j =1;j <= 2 * i - 1;j++){
				if(j == 1 || j == 2 * i - 1){
					System.out.print("*" + " ");
				} else {
					System.out.print("  ");
				}
			}
			//每打印一层后换行
			System.out.println();
		}
		//后totalLevel/2层
		for(int i = 1;i <= totalLevel / 2;i++){
			for(int k = 1;k <= i;k++){
				System.out.print("  ");
			}
			for(int j = 1;j <= 2* ((totalLevel / 2 + 1) - i) - 1;j++){
				if(j == 1 || j == 2* ((totalLevel / 2 + 1) - i) - 1){
					System.out.print("*" + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}