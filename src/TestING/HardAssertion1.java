package TestING;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion1 {

	@Test
	public void m1() {
		
		boolean A = true;
		
		
		Assert.assertTrue(A);
	}
	

	@Test
	public void m2() {
		
		boolean A = false;
		
		
		Assert.assertTrue(A);
	}
	

	@Test
	public void m3() {
		
		boolean A = true;
		
		
		Assert.assertFalse(A);
	}
	

	@Test
	public void m4() {
		
		boolean A = false;
		
		
		Assert.assertFalse(A);;
	}
	
	
	
	
	
	
}
