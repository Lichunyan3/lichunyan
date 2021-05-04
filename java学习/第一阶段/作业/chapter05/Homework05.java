public class Homework05{
	public static void main(String[] args){
		//输出小写的a-z以及大写的Z-A
		for (char i = 'a';i <= 'z';i++){
			System.out.print(i + " ");
		}	
		System.out.println();
		for (char j = 'Z';j >= 'A';j--){
			System.out.print(j + " ");
		}	
	}
}