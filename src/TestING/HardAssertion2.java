package TestING;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion2 {

	@Test
	public void M1() {
		
		String S = null;
		
		Assert.assertNull(S);
	}
	
	@Test
	public void M2() {
		
		String S = "Ravikishan";
		
		Assert.assertNull(S);
	}
	
	@Test
	public void M3() {
		
		String S = null;
		
		Assert.assertNotNull(S);
	}
	
	@Test
	public void M4() {
		
		String S = "Ravikishan";
		
		Assert.assertNotNull(S);
	}
}
//""