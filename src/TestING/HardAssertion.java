package TestING;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {

	@Test
	public void M1() {
		
	
	String S = "Rushi";
	
	String S1 = "Rushi";
	
	Assert.assertEquals(S, S1);
	
	}
	
	@Test
	public void M2() {
		
	
	String S = "Rushi";
	
	String S1 = "Rajesh";
	
	Assert.assertEquals(S, S1);
	
	}
	
	@Test
	public void M3() {
		
	
	String S = "Rushi";
	
	String S1 = "Rushi";
	
	Assert.assertNotEquals(S, S1);
	
	
	
	}
	
	@Test
	public void M4() {
		
	
	String S = "Rushi";
	
	String S1 = "Rajesh";
	
	Assert.assertNotEquals(S, S1);;
	
	}
	
	
}
//""