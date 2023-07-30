package TestNgSuite;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test006Group {

	@Test (groups = "Homepage")
	public void tc07() {
		Reporter.log("Test case 07 execute",true);
//		System.out.println("Test case 07 execute");
		Assert.fail();
	}
	
	@Test (groups = "Signup")
	public void tc08() {
		Reporter.log("Test case 08 execute",true);
//		System.out.println("Test case 08 execute");
	}
	
	@Test (groups = "Signup")
	public void tc09() {
		Reporter.log("Test case 09 execute",true);
//		System.out.println("Test case 09 execute");
	}
	
}
