package SeleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Configuration.ConfigurationPath;

public class ExplicitWait2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		 WebElement A = driver.findElement(By.xpath("//input[@id='email']"));
		 
		 WebDriverWait W = new WebDriverWait(driver,Duration.ofSeconds(10));
		 
		 W.until(ExpectedConditions.visibilityOf(A));
		 
		 A.sendKeys("qwerty");
	}
}
//""