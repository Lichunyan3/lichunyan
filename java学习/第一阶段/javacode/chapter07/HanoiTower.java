public class HanoiTower{
	public static void main(String[] args){
		Tower t = new Tower();
		t.move(3,'A','B','C');
	}
}

class Tower{
	/*
	num表示要移动的个数，a，b，c分别表示A，B，C塔
	*/
	public void move(int num,char a,char b,char c){
		if(num == 1){
			System.out.println(a + "->" + c);
		} else {
			//如果有多个盘，可以看成两个，最下面的和最上面的所有盘（num-1）
			//先移动上面所有的盘到b，借助c
			move(num - 1,a,c,b);
			//把最下面的这个盘移动到c
			System.out.println(a + "->" + c);
			//再把b塔上所有的盘移动到c，借助a
			move(num - 1,b,a,c);
			
		}
	}
}