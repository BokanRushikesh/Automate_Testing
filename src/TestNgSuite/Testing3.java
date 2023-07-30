package TestNgSuite;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing3 {

	@Test(groups = "login")
	public void tc07() {
		
		Reporter.log("test case 07 execute",true);
	}
	
	@Test(groups = "signup")
	public void tc08() {
		
		Reporter.log("test case 08 execute",true);
	}
	
	@Test(groups = "login")
	public void tc09() {
		
		Reporter.log("test case 09 execute",true);
	}
}
