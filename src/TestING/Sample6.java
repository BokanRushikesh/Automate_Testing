package TestING;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample6 {

	@Test(priority=3)
	public void tc01() {
		
		System.out.println("Firstname Successful");
	}
	
	@Test(priority=1,timeOut = 2000)
	public void tc02() throws InterruptedException {
		
		System.out.println("Lastname Successful");
		Thread.sleep(1000);
	}
	
	@Test(priority=2 ,timeOut = 2000)
	public void tc03() throws InterruptedException {
		
		System.out.println("Sirname Successful");
		
		Thread.sleep(1000);
	}
	
	@BeforeMethod
	public void Login() {
		
		System.out.println("Login Successful");
	}
	
	@AfterMethod
	
	public void LogOut() {
		
		System.out.println("LogOut Successful");
	}
	@BeforeClass
	public void Browser() {
		
		System.out.println("Browser Launch");
	}
	
	@AfterClass
	public void End() {
		
		System.out.println("Browser Clased");
	}
}
