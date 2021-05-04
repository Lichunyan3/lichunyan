import java.util.Scanner;
public class SeqSearch{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		String[] fruits = {"香蕉", "草莓", "葡萄", "柚子", "西瓜", "葡萄"};
		System.out.println("请输入你想要找的水果：");
		String find = myScanner.next();
		int[] index = new int[]{-1};//一个经典的方法,如果想找的数组里不只一个
		int count = 0;//累积寻找物的个数
		for(int i = 0;i < fruits.length;i++){
			if(find.equals(fruits[i])){
				index[0] = i;
				count++;
				int indexNew[] = new int[count];
				indexNew[indexNew.length - 1] = i;
				index = indexNew;	
			}
		}
		for(int i = 0;i < index.length;i++){
			System.out.println("找到了" + find + "索引是" + index[i]);
		}
		if(index[0] == -1){//说明没有找到
			System.out.println("对不起，没有您想找的水果-" + find);
		}
	}
}