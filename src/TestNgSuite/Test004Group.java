package TestNgSuite;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test004Group {

	@Test (groups = "Login")
	public void tc01() {
	Reporter.log("Test case 01 execute",false);
//		System.out.println("Test case 01 execute");
	}
	
	@Test (groups = "Signup")
	public void tc02() {
		Reporter.log("Test case 02 execute",true);
//		System.out.println("Test case 02 execute");
		Assert.fail();
	}
	
	@Test (groups = "Homepage")
	public void tc03() {
		Reporter.log("Test case 03 execute",false);
//		System.out.println("Test case 03 execute");
	}
	
}

//""