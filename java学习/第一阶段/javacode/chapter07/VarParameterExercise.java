public class VarParameterExercise{
	public static void main(String[] args){
		HspMethod md = new HspMethod();
		System.out.println(md.showScore("李四",89,99.5));
		System.out.println(md.showScore("周三",79,89.5,67.7));
		System.out.println(md.showScore("王五",79,89.5,67.7,89,99.5));
	}
}

class HspMethod{
	public String showScore(String name,double... scores){
		double totalScore = 0;
		for(int i = 0;i < scores.length;i++){
			totalScore += scores[i];	
		}
		return name + "的" + scores.length + "门课总分为" + totalScore;
	}
	
}