public class MulForExercise02{
	public static void main(String[] args){
		//�žų˷���
		//for(int i = 1;i <= 9;i++){
		//	for(int j = 1;j <= i;j++){
		//		System.out.print(j + "*" + i + "=" + (i * j) + "\t");
		//	}
		//	System.out.println();
		//}
		
		//����Ĵ�ӡ������
		/*
			1���ȴ�ӡһ������
			* * * * * 
			* * * * * 
			* * * * * 
			* * * * * 
			* * * * *
			2����ӡ���������
			*  
			* * 
			* * *  
			* * * * 
			* * * * *
			3����ӡ����������
					*          //��һ����1��*�� 2*1-1����4=���ܲ���-1�����ո�
				  * * * 	   //�ڶ�����3��*�� 2*2-1����3=���ܲ���-2�����ո�
				* * * * *      ...
			  * * * * * * * 
			* * * * * * * * *
			4����ӡ���Ľ�����
					*          //��һ����1��* 
				  *   * 	   //�ڶ�����2��*�����еĵ�һ��λ����*�����һ��λ��Ҳ��* 
				*       *      ...
			  *           * 
			* * * * * * * * *  //�������9��*
			�������ɱ���totalLevel
			��չ�⣺��ӡһ�����Σ�
		*/
		int totalLevel = 9;
		for(int i =1;i <= totalLevel;i++){//i��ʾ����
		//���*֮ǰ����Ҫ�����Ӧ�ո� �ܲ���-��ǰ��
			for(int k = 1;k <= totalLevel - i;k++){
				System.out.print("  ");
			}
			for(int j =1;j <= 2 * i - 1;j++){
				if(j == 1 || j == 2 * i - 1 || i == totalLevel){
					System.out.print("*" + " ");
				} else {
					System.out.print("  ");
				}
			}
			//ÿ��ӡһ�����
			System.out.println();
		}
	}
}