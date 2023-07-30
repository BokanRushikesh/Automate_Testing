package TestNgSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Configuration.ConfigurationPath;

public class Parallel2 {

	@Test
	@Parameters("Browser")
	public void M1(String str) {
		
		Reporter.log("Test case executed");
		
		System.out.println(str);
		
		
		if(str.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
			
			ChromeOptions opt  = new ChromeOptions();
			
			opt.addArguments("--remote-allow-origins=*");
			
			
			WebDriver driver = new ChromeDriver(opt);
			
			driver.get("https://www.amazon.in/");
			
//			driver.manage().window().maximize();
			
			driver.close();
		}
		
		else if(str.equalsIgnoreCase("Firefox")) {
			
         System.setProperty("webdriver.Firefoxdriver", ConfigurationPath.Firefox);
			
			WebDriver driver = new FirefoxDriver();
			
			driver.get("https://www.amazon.in/");
			
//			driver.manage().window().maximize();
			
			driver.close();
			
			
		}
		
		else {
			
			System.out.println("Method is not executed");
		}
		
		
		
		
		
	}
}
//""