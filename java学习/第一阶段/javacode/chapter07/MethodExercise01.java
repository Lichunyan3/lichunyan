public class MethodExercise01{
	public static void main(String[] args){
		AA a = new AA();
		if(a.isOdd(26)){
			System.out.println("����һ������");
		} else{
			System.out.println("����һ��ż��");
		}
		a.printChar(4,2,'*');
	}
}
//�����ķ�������booleaan
//����������isOdd
//�������β�int n
//������
class AA{
	public boolean isOdd(int n){
		if(n % 2 != 0){
			
			return true;
			
		} else{
			
			return false;
			
		}
		//return n % 2 != 0;
	}
	//��ӡ��Ӧ�������������ַ�
	public void printChar(int row,int col,char a){
		for(int i = 1;i <= row;i++){
			for(int j = 1;j <= col;j++){
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}
	
}