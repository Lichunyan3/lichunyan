public class TestPerson{
	public static void main(String[] args){
		Person p1 = new Person("jack",13);
		Person p2 = new Person("jack",13);
		System.out.println("两人的比较结果为" + p1.compareTo(p2));
	}
}
class Person{
	String name;
	int age;
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public boolean compareTo(Person p){
		if((this.name).equals(p.name) && this.age == p.age){//名字和年龄完全一样
			return true;
		} else {
			return false;
		}
	}
}