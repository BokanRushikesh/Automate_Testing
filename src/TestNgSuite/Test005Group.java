package TestNgSuite;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test005Group {


	@Test (groups = "Login")
	public void tc04() {
		Reporter.log("Test case 04 execute",true);
//		System.out.println("Test case 04 execute");
	}
	
	@Test (groups = "Signup")
	public void tc05() {
		Reporter.log("Test case 05 execute",true);
//		System.out.println("Test case 05 execute");
		Assert.fail();
	}
	
	@Test (groups = "Login")
	public void tc06() {
		Reporter.log("Test case 06 execute",true);
//		System.out.println("Test case 06 execute");
	}
	
}
