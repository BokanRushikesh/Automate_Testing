package TestING;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

	@Test
	public void M1() {
		
		String S ="Hi";
		
		String S1 ="Hi";
		
		Assert.assertEquals(S, S1);
		
		
		
		String name ="Surya";
		
		String Lastname ="Yadav";
		
		Assert.assertNotEquals(name, Lastname);
		
		
		String str ="xyz";
		
		String str1 ="xyz";
		
		Assert.assertEquals(str, str1);
	}
}
//""