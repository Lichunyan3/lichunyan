public class ConstructorExercise{
	public static void main(String[] args){
		Person p1 = new Person();
		Person p2 = new Person("jack",20);
		System.out.println("p1.age=" + p1.age + ",p1.name=" + p1.name);
		System.out.println("p2.age=" + p2.age + ",p2.name=" + p2.name);
	}
}

class Person{
	int age;
	String name;
	public Person(){
		age = 18;
	}
	public Person(String pName,int pAge){
		name = pName;
		age = pAge;
	}
}