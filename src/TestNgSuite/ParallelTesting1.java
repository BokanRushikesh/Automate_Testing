package TestNgSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Configuration.ConfigurationPath;

public class ParallelTesting1 {

	@Test
	@Parameters("Browser")
	
	public void together(String str) {
		
		Reporter.log("Test case executed",true);
		
		if(str.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
			
			ChromeOptions opt = new ChromeOptions();
			
			opt.addArguments("--remote-allow-origins=*");
			
			WebDriver driver = new ChromeDriver(opt);
			
			driver.get("https://en-gb.facebook.com/reg/");
			
			driver.manage().window().maximize();
			
		}
		
		else if(str.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.firefoxdriver", ConfigurationPath.WebDriverPath);
			
			
			
			
			
			WebDriver driver = new FirefoxDriver();
			
			driver.get("https://en-gb.facebook.com/reg/");
			
			driver.manage().window().maximize();
		}
		
		else {
			System.out.println("not valid");
		}
	}
}
//""