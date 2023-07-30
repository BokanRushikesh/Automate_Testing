package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hassert1 {

	@Test
	public void m1() {
		
		String S = "Avengers";
		
		String S1 = "Avengers";
		
		Assert.assertEquals(S, S1);
		
	}
	
	@Test
	public void m2() {
		
		String S = "swing is king";
		
		String S1 = "swing is being";
		
		Assert.assertNotEquals(S, S1);
	}
	
	@Test
	public void m3() {
		
	  boolean b = true;
	  
	  Assert.assertTrue(b);
	}
	
	@Test
	public void m4() {
		
		boolean b = false;
		
		Assert.assertFalse(b);
	}
	
	@Test
	public void m5() {
		
		String S = null;
		
		Assert.assertNull(S);
	}
	
	@Test
	public void m6() {
		
		String S = "";
		
		Assert.assertNotNull(S);
	}
	
	
}
//""