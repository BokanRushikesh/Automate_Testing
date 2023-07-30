package TestNgSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Configuration.ConfigurationPath;

public class Parallel1 {

	@Test
	@Parameters("Browser")
	public void m1(String str) {
		
     Reporter.log("Test success");
		
		
		System.out.println(str);
		
		if(str.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.facebook.com/");
	}
		
		else if (str.equalsIgnoreCase("Firefox")){
			
			System.setProperty("webdriver.geckodriver", ConfigurationPath.Firefox);
			
			WebDriver driver = new FirefoxDriver();
			
			driver.get("https://www.facebook.com/");
			
		}
		
		else {
			
			System.out.println("invaid data");
		}
}
}
//""