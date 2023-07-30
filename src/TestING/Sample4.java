package TestING;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample4 {

	

	
	

		
		@Test(priority=3)
		public void tc01() {
			
			System.out.println("Firstname Successful");
		}
		
		@Test(priority=1)
		public void tc02() {
			
			System.out.println("Lastname Successful");
		}
		
		@Test(priority=2)
		public void tc03() {
			
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

