public class MulForExercise03{
	public static void main(String[] args){
		int totalLevel = 11;//�������
		//���Ȱ����ο������£��������ģ���һ��for��5�Σ��ڶ���for��4��
		for(int i =1;i <= totalLevel / 2 + 1;i++){//i��ʾ����
		//���*֮ǰ����Ҫ�����Ӧ�ո� �ܲ���-��ǰ��
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
			//ÿ��ӡһ�����
			System.out.println();
		}
		//��totalLevel/2��
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