package TestING;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Configuration.ConfigurationPath;

public class Run {

	WebDriver driver;
	
	Pom Sign;
	
	@BeforeClass
	public void LaunchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
	    driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		Sign = new Pom(driver);
		
	}
	
	@BeforeMethod
	public void maximize() 
	{
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void tc01() throws EncryptedDocumentException, IOException, InterruptedException 
    {
		
		Sign.Firstname(Utility.readdata(1, 0));
		
		Sign.Lastname(Utility.readdata(1, 1));
		
		Sign.MobileNumber(Utility.readdata(1, 2));
		
		Sign.PassWord(Utility.readdata(1, 3));
		
		
	}
	
	@AfterMethod
	public void Refresh() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
	
	@AfterClass
	public void Closed() 
	{
		
		driver.close();
	}
}
//""