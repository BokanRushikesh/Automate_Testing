package SeleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Configuration.ConfigurationPath;

public class ExplicitWait3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		 WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
		 
		 WebDriverWait W = new WebDriverWait(driver,Duration.ofSeconds(10));
		 
		 W.until(ExpectedConditions.visibilityOf(btn));
		 
		 btn.click();
	}
}
//""