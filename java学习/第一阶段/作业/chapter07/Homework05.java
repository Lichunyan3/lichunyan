public class Homework05{
	public static void main(String[] args){
		Cale c1 = new Cale(2,1);	
		c1.divide();
		Cale c2 = new Cale(7,5);	
		c2.multiply();
	}
}
class Cale{
	double num1;
	double num2;
	public Cale(double num1,double num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	public void sum(){
		double res = num1 + num2;
		System.out.println("两数的和为" + res);
	}
	public void minus(){
		double res = num1 - num2;
		System.out.println("两数的差为" + res);
	}
	public void multiply(){
		double res = num1 * num2;
		System.out.println("两数的积为" + res);
	}
	public void divide(){
		if(num2 != 0){
			double res = num1 / num2;
			System.out.println("两数的商为" + res);
		} else {
			System.out.println("除数不能为0");
		}
	}
}