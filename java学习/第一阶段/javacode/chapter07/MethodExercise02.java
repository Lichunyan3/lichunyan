public class MethodExercise02{
	public static void main(String[] args){
		int[][] arr = {{1,3,4},{2,5},{1}};
		MyTools m = new MyTools();
		m.printArr(arr);
		Person p = new Person();
		p.name = "li";
		p.age = 21;
		Person p1 = m.copyPerson(p);
		System.out.println("p1.name=" + p1.name + "\tp1.age=" + p1.age);
		System.out.println(p == p1);
	}
}

class Person{
	String name;
	int age;
}
class MyTools{
	public void printArr(int[][] arr){
		for(int i = 0;i < arr.length;i++){
			for(int j = 0;j < arr[i].length;j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	//克隆，对象是独立的
	public Person copyPerson(Person p){
		Person p1 = new Person();
		p1.name = p.name;
		p1.age = p.age;
		return p1;
	}
}