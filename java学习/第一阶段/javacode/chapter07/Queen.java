public class Queen{
	int[] cheese = new int[8];//8行 
	static int count = 0;//累积所有的解法
	public static void main(String[] args){
		//创建棋盘 一维数组
		//cheese[0] = 0,代表第一个皇后摆在第一行第一列
		
		Queen q = new Queen();
		q.check(0);
		System.out.println("一共有" + count + "种解法");
		
	}
	
	//放置第n个皇后
	private void check(int n){
		if(n == 8){//n=8，n从0开始，到8的时候8个皇后已经放好了
			print();
			return;
		}
		//依次放入皇后，判断是否冲突
		for(int i = 0;i < cheese.length;i++){
			//把当前皇后n放到该行的第一列
			cheese[n] = i;
			//判断是否冲突
			if(judge(n)){
				//不冲突，继续放下一个
				check(n+1);
			}
		}
	
	}
	//判断摆放第n个皇后是否冲突 返回false表示冲突 返回true不冲突
	private boolean judge(int n){
		for(int i = 0;i < n;i++){
			if(cheese[i] == cheese[n] || Math.abs(n-i) == Math.abs(cheese[n]-cheese[i])){
				return false;
			}
		}
		return true;
	}
	//输出皇后的摆放位置
	private void print(){
		count++;
		for(int i = 0;i < cheese.length;i++){
			System.out.print(cheese[i] + " ");
		}
		System.out.println();
	}
}	