public class OperatorExercise02{
	public static void main(String[] args){ 
		boolean x = true;
		boolean y = false;
		short z = 46;
		if((z++ == 46) && (y = true)) z++;//z=48
		if((x = false) || (++z == 49)) z++;//z=50
		System.out.println("z = " + z);//z=50
	}
}