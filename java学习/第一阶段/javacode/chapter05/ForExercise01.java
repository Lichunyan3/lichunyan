public class ForExercise01{
	public static void main(String[] args){
		//forѭ����ϰ ��ӡ1-100֮��������9�ı�����������ͳ�Ƹ������ܺ�
		//���˼�루���ɣ�
		//����Ϊ�򣺽����ӵ�������ɼ򵥵����������
		//�������ȿ��ǹ̶���ֵ��Ȼ��ת�ɿ������仯��ֵ
		//1��������1-100��ֵ
		//2��������Ĺ����У����й��ˣ�ֻ���9�ı���
		//3��ͳ�Ƹ���������һ��������������������ʱcount++
		//4���ܺ� ����һ������������������ʱ�ۻ�sum += i
		
		//1��Ϊ����Ӧ���õ����󣬰ѷ�Χ�Ŀ�ʼֵ�ͽ�����ֵ ��������
		//2�������Ը���һ����9 ����Ҳ���ɱ���
		int count = 0;
		int sum = 0;
		int start = 1;
		int end = 10;
		int beishu = 4;
		for(int i = start; i <= end; i++){
			if(i % beishu == 0){
				System.out.println("i=" + i);
				count++;
				sum += i;	
			}
		}
		System.out.println("count=" + count + ",sum=" + sum);
		
	}
}