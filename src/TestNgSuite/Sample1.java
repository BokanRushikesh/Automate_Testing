package TestNgSuite;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample1 {

	@Test
	@Parameters("browser")
	public void m1(String str) {
		
		
		Reporter.log("This is my program",true);
		
		System.out.println(str);
	}
}
//""