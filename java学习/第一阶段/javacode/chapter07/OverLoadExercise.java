public class OverLoadExercise{
	public static void main(String[] args){
		Methods md = new Methods();
		System.out.println(md.m(2));
		System.out.println(md.m(2,3));
		System.out.println(md.m("b"));
		System.out.println(md.max(2,5));
		System.out.println(md.max(2.0,3.3));
		System.out.println(md.max(2.0,3.3,11.3));
	}
}

class Methods{
	public int m(int n){
		return n * n;
	}
	public int m(int n1,int n2){
		return n1 * n2;
	}
	public String m(String n){
		return n;
	}
	public int max(int n1,int n2){
		return n1 > n2 ? n1 : n2;
	}
	public double max(double n1,double n2){
		return n1 > n2 ? n1 : n2;
	}
	public double max(double n1,double n2,double n3){
		//return ((n1 > n2 ? n1 : n2) > n3) ? (n1 > n2 ? n1 : n2) : n3;
		double max1 = n1 > n2 ? n1 : n2;
		return max1 > n3 ? max1 : n3;
	}
}