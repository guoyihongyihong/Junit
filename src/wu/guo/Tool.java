package wu.guo;

public class Tool {
	public int getMax(){
		int a = 3;
		int b = 5;
		int max = a>b?a:b;
		//System.out.println("最大值:" + max);
		return max;
	}
	
	public int getMin(){
		int a = 3;
		int b = 5;
		int min = a>b?b:a;
		//System.out.println("最大值:" + max);
		return min;
	}
}
