public class Homework01{
	public static void main(String[] args){
		int interChange = 0;//ͳ�ƾ�����·����
		double money = 100000;
		while(money >= 0){
			if(money > 50000){//�ֽ����5��ÿ�ν�5%
				//money = money - money * 0.05;
				money *= 0.95;
			} else if(money >= 1000 && money <= 50000) {//1000-50000ÿ�ν�1000
				money -= 1000;
			} else {//С��1000
				break;
			}
			interChange++;
		}
		System.out.println("���˿��Ծ���" + interChange + "��·��");
	}
}