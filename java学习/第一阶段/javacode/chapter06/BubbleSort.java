public class BubbleSort{
	//ð������
	public static void main(String[] args){
		int[] arr = {24, 69, 80, 57, 13, -3, 89, 78};
		int temp;//��Ž�С���Ǹ���
		for(int i = arr.length - 1; i > 0;i--){//���У����鳤��-1��������
			for(int j = 0;j < i;j++){//����Ԫ�ش�С�Ƚϣ�ÿ�ֱȽϴ�����1
				if(arr[j] > arr[j + 1]){
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i] + "\t");
		}
	}
}