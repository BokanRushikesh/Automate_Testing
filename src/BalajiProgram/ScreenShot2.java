package BalajiProgram;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import Configuration.ConfigurationPath;

public class ScreenShot2 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver =  new ChromeDriver(opt);
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Tuman");
		
		ScreenShot2.capturescreenshot(driver);
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("meri");
		
		ScreenShot2.capturescreenshot(driver);
		
		
		
	}
	
	public static void capturescreenshot(WebDriver driver) throws IOException {
		
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 Date d = new Date();
		 
		  String str = d.toString().replace(":", "_");
		  
		  File dest = new File(ConfigurationPath.Screenshot+str+"image.jpg");
		 
		  FileHandler.copy(source, dest);
		
	}
}
//""