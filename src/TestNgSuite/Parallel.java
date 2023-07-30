package TestNgSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel {

	@Test
	@Parameters("Browser")
	public void M1(String str) {
		
		
		Reporter.log("Test case executed");
		
		System.out.println(str);
		
		
		if(str.equalsIgnoreCase("chrome"))	{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");
			
			ChromeOptions opt = new ChromeOptions();
			
			opt.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(opt);
			
			driver.get("https://www.facebook.com/login/");
		
		}
		else {
			
			
			System.out.println("Not valid");
		}
		
		
		
		
	}
	
	
	
	
}
//""