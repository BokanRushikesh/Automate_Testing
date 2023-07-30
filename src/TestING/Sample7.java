package TestING;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample7 {

	@BeforeClass
	public void Launch() {
		
		Reporter.log("Launch Browser",true);
	}
	@BeforeMethod
	public void Login() {
		
		Reporter.log("Successful",true);
	}
	
	
	@Test (dependsOnMethods = "M2")
	public void M1() {
		
		Reporter.log("FirstName",true);
	}
	@AfterMethod
	public void Logout() {
		
		Reporter.log("Logout System",false);
	}
	
	
	@Test
	public void M2() {
		
		Reporter.log("MiddleName",true);
//		Assert.fail();
		
	}
	
	@Test
	public void M3() {
		
		Reporter.log("LastName",false);
	}
	
	
	
	
	
	@AfterClass
	public void End() {
		
		Reporter.log("Close",true);
	}
}
//""