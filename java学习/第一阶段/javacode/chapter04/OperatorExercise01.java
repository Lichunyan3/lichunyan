public class OperatorExercise01{
	public static void main(String[] args){ 
		int x = 5;
		int y = 5;
		if(x++ == 6 & ++y == 6){
		x=11;
		}
		System.out.println("x = " + x + ",y = " + y);//x=5,y=6
		
		int a = 5;
		int b = 5;
		if(a++ == 6 && ++b == 6){
		a=11;
		}
		System.out.println("a = " + a + ",b = " + b);//a=5,b=5
		
		int i = 5,j = 5;
		if(i++ == 5 | ++j == 5){
		i=11;
		}
		System.out.println("i = " + i + ",j = " + j);//i=11,j=6
		
		int m = 5,n = 5;
		if(m++ == 5 || ++n == 5){
		m=11;
		}
		System.out.println("m = " + m + ",n = " + n);//m=11,n=5
	}
}