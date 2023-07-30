package Listners;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Configuration.ConfigurationPath;

public class FBlogin2 {

	
	WebDriver driver ;
	
	FBlogin1 signup ;
	
	String  tcID ;
	
	@BeforeClass
	public void Launch() {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(opt);
		 
		 driver.get("https://www.facebook.com/");
		 
		 
		 signup = new FBlogin1(driver);
		
	}
	
	@BeforeMethod
	public void maximize() {
		
		driver.manage().window().maximize();
		
	}
	
	
	@Test
	public void tc01() throws EncryptedDocumentException, IOException {
		
		tcID = "TC001";
	   signup.Username(FBlogin3.readexceldata(4, 0));
		
		signup.Password(FBlogin3.readexceldata(4, 1));
		
		signup.Button();
		
		
		
	}
	
	@Test
	public void tc02() throws EncryptedDocumentException, IOException {
		
		tcID = "TC002";
		signup.Username(FBlogin3.readexceldata(5, 0));
		
		signup.Password(FBlogin3.readexceldata(5, 1));
		
		signup.Button();
		Assert.fail();
	}

	@AfterMethod
	public void refresh(ITestResult res) throws InterruptedException, IOException {
		
		if(res.FAILURE==res.getStatus()) {
			 
			Thread.sleep(2000);
			
			FBlogin3.Screenshot(driver, tcID);
			
		}
		Thread.sleep(2000);
		
	driver.navigate().back();
	
	driver.navigate().refresh();
		
		
	}
	
	@AfterClass
	public void closed() {
		
	driver.close();
		
	}
	
	
	
}
//""