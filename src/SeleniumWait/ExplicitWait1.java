package SeleniumWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Configuration.ConfigurationPath;

public class ExplicitWait1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		
	    WebDriverWait W = new WebDriverWait(driver,Duration.ofSeconds(10));
	    
	    W.until(ExpectedConditions.visibilityOf(email));
	    
	    email.sendKeys("asd");
		
		
		
		//input[@type='text'])[4]
	}

}
//""