public class Homework07{
	public static void main(String[] args){
		Music m = new Music("疯狂世界",3);
		m.play();
		String str = m.getInfo();
		System.out.println(str);
		
	}
}
class Music{
	String name;
	double times;
	public Music(String name,double times){
		this.name = name;
		this.times = times;
	}
	public void play(){
		System.out.println("播放音乐" + this.name);
	}
	public String getInfo(){
		return "音乐名字为：" + this.name + ",音乐时长为：" + this.times + "分钟";
	}
}