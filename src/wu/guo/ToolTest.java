package wu.guo;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ToolTest {
	@Before
	public void beforeRead(){
		System.out.println("测试前");
	}
	@Test
	public void testGetMax(){
		int max = new Tool().getMax();
		
		/*if(max != 5){
			throw new RuntimeException();
		} else {
			System.out.println("最大值：" + max);
		}*/
		//Assert.assertSame(5, max);
		//Assert.assertSame(new String("abc"), "abc"); ==
		Assert.assertEquals(new String("abc"),"abc"); //equals()
		//Assert.assertTrue(true);
	}
	@After
	public void afterRead(){
		System.out.println("测试后");
	}
}
