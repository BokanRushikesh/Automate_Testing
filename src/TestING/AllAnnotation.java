package TestING;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AllAnnotation {

	@Test
	public void M1() {
		
		System.out.println("first name");
	}
	
	@Test
	public void M2() {
		
		System.out.println("middle name");
	}
	
	@Test
	public void M3() {
		
		System.out.println("last name");
	}
	
	@BeforeMethod
	
	
	public void login() {
		
		System.out.println("username");
		
	}
	
	@AfterMethod
	public void logout() {
		
		System.out.println("password");
	}
	
	@BeforeClass
	
       public void launch() {
		
		System.out.println("google");
	}
	
	   @AfterClass
       public void close() {
		
		System.out.println("firefox");
	}
}
//""