package TestNgSuite;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing1 {

	@Test(groups = "signup")
	public void tc01() {
		
		Reporter.log("test case 01 execute",true);
	}
	
	@Test(groups  = "homepage")
	public void tc02() {
		
		Reporter.log("test case 02 execute",true);
	}
	
	@Test(groups = "login")
	public void tc03() {
		
		Reporter.log("test case 03 execute",true);
	}
}
//""