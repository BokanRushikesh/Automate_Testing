package SeleniumWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Configuration.ConfigurationPath;

public class ImplicitWait {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.policybazaar.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		
	}
}
//""