package TestNgSuite;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing2 {

	@Test(groups = "homepage")
	public void tc04() {
		
		Reporter.log("test case 04 execute",true);
	}
	
	@Test(groups = "signup")
	public void tc05() {
		
		Reporter.log("test case 05 execute",true);
	}
	
	@Test(groups = "signup")
	public void tc06() {
		
		Reporter.log("test case 06 execute",true);
	}
}
