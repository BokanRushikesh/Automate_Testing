package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Configuration.ConfigurationPath;

public class Iframe1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
// we use it to enter in a parent frame
		driver.switchTo().frame("SingleFrame");
		Thread.sleep(2000);
//	Locator of child frame 	
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abcd");
		Thread.sleep(2000);
// we use it to enter in webpage frame		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
//	we use it to click home button	
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		//input[@type='text']
		
		
		//iframe[@name='SingleFrame']
		
		//iframe[@src='MultipleFrames.html']
		
	}

}
