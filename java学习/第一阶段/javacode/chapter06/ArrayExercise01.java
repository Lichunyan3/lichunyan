public class ArrayExercise01{
	public static void main(String[] args){
		//char���͵����飬���á�A-Z��
		char[] alphabet = new char[26];
		for(int i = 0;i < alphabet.length;i++){
			alphabet[i] = (char)('A' + i);
			System.out.print(alphabet[i] + " ");
		}
		
		System.out.println();
		//���һ����������ֵ{4,-1,9,10,23},���õ���Ӧ���±�
		int[] num = {4,-1,9,10,23};
		int max = num[0];//�ٶ���һ���������ֵ
		int maxIndex = 0;
		for(int i = 1;i < num.length;i++){
			if(num[i] > max){
				max = num[i];
				maxIndex = i;
			}
		}
		System.out.println("���ֵΪ" + max + ",��Ӧ���±�Ϊ" + maxIndex);
		
		//���鷴ת
		int temp;
		int[] arr = {11,22,33,44,55,66};
		for(int i = 0;i < arr.length / 2;i++){//�Գƽ���
			temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i] + "\t");
		}
		
		System.out.println();
		//���鷴ת��ʹ������ֵ�ķ�ʽ
		int[] arr1 = {67,56,45,89,56};
		int[] arr2 = new int[arr1.length];//����һ���µ�����
		for(int i = arr1.length - 1;i >= 0;i--){//�������
			arr2[arr1.length - 1 - i] = arr1[i];
		}
		arr1 = arr2;
		for(int i = 0;i < arr1.length;i++){
			System.out.print(arr1[i] + "\t");
		}
	}
}