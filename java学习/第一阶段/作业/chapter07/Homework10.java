public class Homework10{
	public static void main(String[] args){
		Circle c = new Circle();
		PassObject p = new PassObject();
		p.printAreas(c,5);
	}
}
class Circle{
	double radius;
	public double findArea(double radius){
		return Math.PI * radius * radius;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
	
}
class PassObject{
	public void printAreas(Circle c,int times){
		System.out.println("Radius\tarea");
		for(int i = 1;i <= times;i++){
			c.setRadius(i);//修改c对象的半径值
			//c.radius = i;
			double area = c.findArea(i);
			System.out.println((double)i + "\t" + area);
		}
	}
}
