package selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import Configuration.ConfigurationPath;

public class ScreenShot1 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jiomart.com/customer/account/login");
		
		driver.manage().window().maximize();
		M1(driver);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@formcontrolname='loginfirst_mobileno']")).sendKeys("Rushikesh");
		
		M1(driver);
		
	}
	public static void M1(WebDriver driver) throws IOException {
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	 Date d = new Date();
	
	String str = d.toString().replace(":", "-");
	
	File dest = new File ("C:\\Users\\USER\\Documents\\Selenium ScreenShot\\"+str+"image.jpg");

	FileHandler .copy(source, dest);
	
	
}
	
	
}

