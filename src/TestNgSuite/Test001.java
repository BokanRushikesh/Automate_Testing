package TestNgSuite;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test001 {

	@Test
	public void tc01() {
		
		Reporter.log("Test case 01 execute",true);
		
//		System.out.println("Test case 01 execute");
		
		Assert.fail();
	}
	
	@Test
	public void tc02() {
		
		Reporter.log("Test case 02 execute",true);
		
//		System.out.println(" Test case 02 execute");
	}
	
	@Test
	public void tc03() {
		
		Reporter.log("Test case 03 execute",true);
		
//		System.out.println("Test case 03 execute");
	}
	
}
//""