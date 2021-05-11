public class Homework06{
	public static void main(String[] args){
		Dog d = new Dog("小黄","黄色",3);
		d.show();
	}
}
class Dog{
	String name;
	String color;
	int age;
	public Dog(String name,String color,int age){
		this.name = name;
		this.color = color;
		this.age = age;
	}
	public void show(){
		System.out.println("狗的名字为" + this.name + " 狗的颜色为" 
							+ this.color + " 狗的年龄为" + this.age);
	}
}