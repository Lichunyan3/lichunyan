public class Method01{
	public static void main(String[] args){
		Person p1 = new Person();
		p1.speak();//调用方法
		p1.cal01();
		p1.cal02(3);
		int returnRes = p1.getSum(45,23);//把getSum返回的值赋给returnRes
		System.out.println("getSum返回的值=" + returnRes);
	}
}

class Person{
	String name;
	int age;
	public void speak(){
		System.out.println("我很好");
	}
	public void cal01(){
		int res = 0;
		for(int i = 1;i <= 1000;i++){
			res += i;
		}
		System.out.println("cal01计算的和=" + res);
	}
	public void cal02(int n){//形参列表，表示当前有一个形参n，可以接收用户输入
		int res = 0;
		for(int i = 1;i <= n;i++){
			res += i;
		}
		System.out.println("cal02计算的和=" + res);
	}
	public int getSum(int num1,int num2){
		int res = num1 + num2;
		return res;
	} 
}