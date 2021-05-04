public class MethodExercise01{
	public static void main(String[] args){
		AA a = new AA();
		if(a.isOdd(26)){
			System.out.println("这是一个奇数");
		} else{
			System.out.println("这是一个偶数");
		}
		a.printChar(4,2,'*');
	}
}
//方法的返回类型booleaan
//方法的名字isOdd
//方法的形参int n
//方法体
class AA{
	public boolean isOdd(int n){
		if(n % 2 != 0){
			
			return true;
			
		} else{
			
			return false;
			
		}
		//return n % 2 != 0;
	}
	//打印对应行数和列数的字符
	public void printChar(int row,int col,char a){
		for(int i = 1;i <= row;i++){
			for(int j = 1;j <= col;j++){
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}
	
}