public class Queen{
	int[] cheese = new int[8];//8�� 
	static int count = 0;//�ۻ����еĽⷨ
	public static void main(String[] args){
		//�������� һά����
		//cheese[0] = 0,�����һ���ʺ���ڵ�һ�е�һ��
		
		Queen q = new Queen();
		q.check(0);
		System.out.println("һ����" + count + "�ֽⷨ");
		
	}
	
	//���õ�n���ʺ�
	private void check(int n){
		if(n == 8){//n=8��n��0��ʼ����8��ʱ��8���ʺ��Ѿ��ź���
			print();
			return;
		}
		//���η���ʺ��ж��Ƿ��ͻ
		for(int i = 0;i < cheese.length;i++){
			//�ѵ�ǰ�ʺ�n�ŵ����еĵ�һ��
			cheese[n] = i;
			//�ж��Ƿ��ͻ
			if(judge(n)){
				//����ͻ����������һ��
				check(n+1);
			}
		}
	
	}
	//�жϰڷŵ�n���ʺ��Ƿ��ͻ ����false��ʾ��ͻ ����true����ͻ
	private boolean judge(int n){
		for(int i = 0;i < n;i++){
			if(cheese[i] == cheese[n] || Math.abs(n-i) == Math.abs(cheese[n]-cheese[i])){
				return false;
			}
		}
		return true;
	}
	//����ʺ�İڷ�λ��
	private void print(){
		count++;
		for(int i = 0;i < cheese.length;i++){
			System.out.print(cheese[i] + " ");
		}
		System.out.println();
	}
}	