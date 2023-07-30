package TestING;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample1 {

	@Test(priority =3 , invocationCount = 3)
	public void m1() {
		
		Reporter.log("tc 01");
	}
	
	@Test (priority = 0 , timeOut  = 3000)
	public void m2() throws InterruptedException {
		System.out.println("tc 02");
		
		Thread.sleep(1000);
	}
	
	@Test()
	public void m3() {
		System.out.println("tc 03");
		
		Assert.fail();
	}
	@Test(dependsOnMethods = "m3")
	public void m4() {
		System.out.println("tc 04");
	}
	
	@Test(dependsOnMethods = "m3")
	public void m5() {
		
		System.out.println("tc 05");
	}
	
}
//""