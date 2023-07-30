package SeleniumWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Configuration.ConfigurationPath;

public class Implicitwait1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
		WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
		
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
//		Thread.sleep(10000);     -- it will take time upto time out
		
		  fname.sendKeys("acv");
		
		
		
		
		
	}
}
//""