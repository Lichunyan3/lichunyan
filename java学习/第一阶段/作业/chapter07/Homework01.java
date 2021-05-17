public class Homework01{
	public static void main(String[] args){
		double[] arr = {1.4,5.7,35,2.4};
		A01 a1 = new A01();
		Double res = a1.max(arr);
		if(res != null){
			System.out.println("arr的最大值为" + res);
		}
		
		String[] str = {"jack","milan","lisa","joy"};
		A02 a2 = new A02();
		Integer index = a2.find(str,"ll");
		if(index != null){
			System.out.println("要找的元素的索引为" + index);
		}
	}
}
class A01{
	public Double max(double[] arr){
		//保证arr至少有一个元素
		//先判断arr是否为空，在判断长度是否>0
		if(arr != null && arr.length > 0){
			double max = arr[0];
			for(int i = 1;i < arr.length;i++){
				if(arr[i] > max){
					max = arr[i];
				}
			}
			return max;
		} else {
			return null;
		}
	}
}

class A02{
	public Integer find(String[] str,String s){
		if(str != null && str.length > 0){
			int index = -1;
			for(int i = 0;i < str.length;i++){
				if(s.equals(str[i])){
					index = i;
				} 
			}
			return index;
		} else {
			return null;
		}
	}
}