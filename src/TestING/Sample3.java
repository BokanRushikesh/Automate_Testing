package TestING;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample3 {

	
	@Test
	public void Firstname() {
		
		System.out.println("Firstname Successful");
	}
	
	@Test
	public void Lastname() {
		
		System.out.println("Lastname Successful");
	}
	
	@Test
	public void Sirname() {
		
		System.out.println("Sirname Successful");
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
//""