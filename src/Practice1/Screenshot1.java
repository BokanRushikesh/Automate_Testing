package Practice1;

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

public class Screenshot1 {

	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		M1(driver);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		M1(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rushikesh");
		
		M1(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("rrreee");
		
		M1(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		M1(driver);
	
	}
	     public static void M1(WebDriver driver) throws IOException {
		
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Date d = new Date();
		
		String str = d.toString().replace(":", "_");
		
		File dest = new File("C:\\Users\\USER\\Documents\\Selenium ScreenShot\\"+str+"image.jpg");
		
		FileHandler.copy(Source, dest);
		
		
	}
	
	
	
	
	
	
	}
	

//""