package TestNgSuite;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample {

	
	@Test
	
	@Parameters("Browser")
	public void m1(String str) {
		
		
		Reporter.log("Test case executed");
		
		System.out.println(str);
		
	}
	
 }
//""