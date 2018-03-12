package wu.guo;

import java.util.Arrays;

import org.junit.Test;

public class Demo1 {

	public static void main(String[] args) {
		new Demo1().sort();
	}
	@Test
	public  void  getmax(){
		int a = 3;
		int b = 5;
		int max = a>b?a:b;
		System.out.println("最大值:" + max);
	}

	@Test
	public void sort() {
		int[] arr = { 12, 32, 56, 2 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("数组的元素" + Arrays.toString(arr));
	}
}
