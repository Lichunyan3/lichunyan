public class Homework03{
	public static void main(String[] args){
		int[] arr = {23,45,23,56,78};
		A03 a3 = new A03();
		int[] arrNew = a3.copyArr(arr);
		for(int i = 0;i < arrNew.length;i++){
			System.out.print(arrNew[i] + " ");
		}
	}
}
class A03{
	public int[] copyArr(int[] arr){
		int[] arrNew = new int[arr.length];
		for(int i = 0;i < arrNew.length;i++){
			arrNew[i] = arr[i];
		}
		return arrNew;
	}
}