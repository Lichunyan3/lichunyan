import java.util.Scanner;//表示把java.util下的Scanner类(简单文本扫描器)导入
public class Input{
	public static void main(String[] args){ 
	//演示接收用户的输入
	//步骤
	//1、引入、导入Scanner类所在的包
	//2、创建Scanner对象,new 创建一个对象
	//myScanner就是Scanner类的对象
	Scanner myScanner = new Scanner(System.in);
	//3、接收用户的输入，使用相关的方法
	System.out.println("请输入名字");
	String name = myScanner.next();//接收用户输入字符串
	System.out.println("请输入年龄");
	int age = myScanner.nextInt();//接收用户输入int
	System.out.println("请输入薪水");
	double salary = myScanner.nextDouble();//接收用户输入double
	System.out.println("人的信息如下：");
	System.out.println("名字=" + name + ",年龄=" + age +",薪水=" + salary);
	}
}