import java.util.Scanner;
public class SwitchExercise01{
	public static void main(String[] args){
		//switch��֧��ϰ ��Сд��ĸת���ɴ�д
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������Сд��ĸ(a-e)��");
		char zimu = myScanner.next().charAt(0);
		switch(zimu) {
			case 'a':
			System.out.println("A");
			break;
			case 'b':
			System.out.println("B");
			break;
			case 'c':
			System.out.println("C");
			break;
			case 'd':
			System.out.println("D");
			break;
			case 'e':
			System.out.println("E");
			break;
			default:
			System.out.println("�����������");
		}
		
	}
}