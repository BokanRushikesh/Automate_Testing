package Testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Configuration.ConfigurationPath;

public class Mock1 {

     WebDriver driver;
	@BeforeClass
	public void setup() {

		System.setProperty("webdriver.chrome.driver",ConfigurationPath.WebDriverPath);
		
	     driver=new ChromeDriver();
	     
	     driver.get("http://ctnew.developstaging.com/");
	}
	
	@BeforeMethod
	public void OpenUrl() {
		driver.manage().window().maximize();
	}
	
	
	
	@Test
	public void login() throws InterruptedException {
		
		WebElement login = driver.findElement(By.xpath("//a[@href='http://ctnew.developstaging.com/login']"));
		login.click();
		Thread.sleep(2000);
		
		WebElement mailid = driver.findElement(By.id("email"));
		mailid.sendKeys("cross1227@yopmail.com");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("cross1227@yopmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(10000);
		driver.findElement(By.id("from-city")).sendKeys("mumbai");
		//input[@id="from-city"]
	}
	
	@AfterMethod
	public void maximize() {
		
		driver.navigate().refresh();
		
	}
	
		@AfterClass
		public void end() throws InterruptedException {
			
			Thread.sleep(2000);
//			?driver.close();
			
		}
}
