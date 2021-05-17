public class MiGong{
	public static void main(String[] args){
		//创建迷宫 二维数组
		int[][] map = new int[8][7];//8行7列 
		//规定数组元素，0表示可以走，1表示有障碍
		//最上面一行和最下面一行设为1
		for(int i = 0;i < 7;i++){
			map[0][i] = 1;
			map[7][i] = 1;
		}
		//第1列和最后1列全部设为1
		for(int i = 0;i < 8;i++){
			map[i][0] = 1;
			map[i][6] = 1;
		}
		map[3][1] = 1;
		map[3][2] = 1;
		map[2][2] = 1;//回溯
		T t = new T();
		System.out.println(t.findWay1(map,1,1));
		for(int i = 0;i < map.length;i++){
			for(int j = 0;j < map[i].length;j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}

class T{
	//使用递归回溯的思想来解决老鼠出迷宫
	/*
	findWay方法是专门用来找出迷宫的路径
	如果找到就返回true，否则返回false
	map表示迷宫，i，j是老鼠的位置，初始化位置（1，1）
	先规定map数组各个值的含义
	0表示无障碍，1表示有障碍，2表示能走通，3表示走过但走不通是死路
	当map[6][5]=2就说明找到通路，可以结束，否则继续找
	确定老鼠找路策略 下-右-上-左
	*/
	public boolean findWay1(int[][] map,int i,int j){
		if(map[6][5] == 2){
			return true;
		} else {
			if(map[i][j] == 0){
				//假设可以走通
				map[i][j] = 2;
				if(findWay1(map,i + 1,j)){//下
					return true;
				} else if(findWay1(map,i,j + 1)){//右
					return true;
				} else if(findWay1(map,i - 1,j)){//上
					return true;
				} else if(findWay1(map,i,j - 1)){//左
					return true;
				} else {
					map[i][j] = 3;
					return false;
				}
			} else {
				return false;
			}
		}
	}
	
	
	//新策略 上-右-下-左
	public boolean findWay2(int[][] map,int i,int j){
		if(map[6][5] == 2){
			return true;
		} else {
			if(map[i][j] == 0){
				//假设可以走通
				map[i][j] = 2;
				if(findWay2(map,i - 1,j)){//上
					return true;
				} else if(findWay2(map,i,j + 1)){//右
					return true;
				} else if(findWay2(map,i + 1,j)){//下
					return true;
				} else if(findWay2(map,i,j - 1)){//左
					return true;
				} else {
					map[i][j] = 3;
					return false;
				}
			} else {
				return false;
			}
		}
	}
	
}