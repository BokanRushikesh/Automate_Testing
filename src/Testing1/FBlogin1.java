package Testing1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Configuration.ConfigurationPath;

public class FBlogin1 {

	
	WebDriver driver ;
	
	FBlogin signup ;
	
	String  tcID ;
	
	@BeforeClass
	public void Launch() {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		 driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 
		 
		 signup = new FBlogin(driver);
		
	}
	
	@BeforeMethod
	public void maximize() {
		
		driver.manage().window().maximize();
		
	}
	
	
	@Test
	public void tc01() throws EncryptedDocumentException, IOException {
		
		tcID = "TC001";
	   signup.Username(Utility1.readexceldata(4, 0));
		
		signup.Password(Utility1.readexceldata(4, 1));
		
		signup.Button();
		
		
		
	}
	
	@Test
	public void tc02() throws EncryptedDocumentException, IOException {
		
		tcID = "TC002";
		signup.Username(Utility1.readexceldata(5, 0));
		
		signup.Password(Utility1.readexceldata(5, 1));
		
		signup.Button();
		Assert.fail();
	}

	@AfterMethod
	public void refresh(ITestResult res) throws InterruptedException, IOException {
		
		if(res.FAILURE==res.getStatus()) {
			 
			Thread.sleep(2000);
			
			Utility1.Screenshot(driver, tcID);
			
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