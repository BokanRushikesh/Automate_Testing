package Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Configuration.ConfigurationPath;

public class BasicAssertions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		ChromeOptions opt  = new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
		 String title = driver.getTitle();
		 
		 System.out.println(title);
		 
		 if(title.equals("Sign up for Facebook | Facebk")) {
			 
			 System.out.println("verified");
		 }
		 
		 else {
			 System.out.println("fail");
		 }
	}
}
//""