package TestING;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample9 {

	@BeforeClass
	
	public void Launch() {
		
		System.out.println("launch");
		
	}
	@Test
	public void m1() {
		
		System.out.println("firstname");
		
	}
	
	@Test
	public void m2() {
		
		System.out.println("middlename");
		
	}
	
	@Test
	public void m3() {
		
		System.out.println("lastname");
		
	}
	
       @BeforeMethod
	
	public void Login() {
		
		System.out.println("login");
		
	}
       
       @AfterMethod
   	
   	public void logout() {
   		
   		System.out.println("logout ok");
   		
   	}
	
     @AfterClass
	
	public void End() {
		
		System.out.println("End");
		
	}
}
//""