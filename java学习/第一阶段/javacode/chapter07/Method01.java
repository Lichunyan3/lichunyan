public class Method01{
	public static void main(String[] args){
		Person p1 = new Person();
		p1.speak();//���÷���
		p1.cal01();
		p1.cal02(3);
		int returnRes = p1.getSum(45,23);//��getSum���ص�ֵ����returnRes
		System.out.println("getSum���ص�ֵ=" + returnRes);
	}
}

class Person{
	String name;
	int age;
	public void speak(){
		System.out.println("�Һܺ�");
	}
	public void cal01(){
		int res = 0;
		for(int i = 1;i <= 1000;i++){
			res += i;
		}
		System.out.println("cal01����ĺ�=" + res);
	}
	public void cal02(int n){//�β��б���ʾ��ǰ��һ���β�n�����Խ����û�����
		int res = 0;
		for(int i = 1;i <= n;i++){
			res += i;
		}
		System.out.println("cal02����ĺ�=" + res);
	}
	public int getSum(int num1,int num2){
		int res = num1 + num2;
		return res;
	} 
}