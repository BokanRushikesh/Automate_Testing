package TestING;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HFail {
	

	@Test
	public void M1() {
		
		String S = "Rajiv";
		
		String S1 = "Rajiv";
		
		Assert.assertEquals(S, S1);
		
		
		
		String A = "Rushi";
		
		String A1 = "Rushiiiii";
		
		Assert.assertEquals(A, A1);
		
		
		
		String B = "vijay";
		
		
		String B1 = "sajiv";
		
		
		Assert.assertNotEquals(B, B1);
		
		
	}
}
//""