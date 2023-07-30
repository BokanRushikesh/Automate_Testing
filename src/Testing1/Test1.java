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

public class Test1 {

	WebDriver driver ;
	
	Pom1 signup ;
	
	String tcID;
	
	
	@BeforeClass
	public void LaunchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		 driver = new ChromeDriver();
		 
		 driver.get("https://en-gb.facebook.com/reg/");
		 
		 
		 signup = new Pom1(driver);
		
	}
	
	@BeforeMethod
	public void maximize() {
		
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void tc01() throws EncryptedDocumentException, IOException {
		
		tcID = "TC001";
		signup.firstname(Utility1.readexceldata(4, 0));
		
		signup.Lastname(Utility1.readexceldata(4, 1));
		
		signup.Password(Utility1.readexceldata(4, 3));
		
		signup.Mobile(Utility1.readexceldata(4, 2));
		
		
		
	}
	
	@Test
	public void tc02() throws EncryptedDocumentException, IOException {
		
		tcID = "TC002";
		
         signup.firstname(Utility1.readexceldata(5, 0));
		
		signup.Lastname(Utility1.readexceldata(20, 1));
		
		signup.Mobile(Utility1.readexceldata(5, 2));
		
		signup.Password(Utility1.readexceldata(5, 3));
		
		
	}
	
	@Test
	public void tc03() throws EncryptedDocumentException, IOException {
		
		tcID = "TC003";
		
         signup.firstname(Utility1.readexceldata(6, 0));
		
		signup.Lastname(Utility1.readexceldata(10, 0));
		
		signup.Mobile(Utility1.readexceldata(6, 2));
		
		signup.Password(Utility1.readexceldata(6, 3));
		
		
	}
	
	@AfterMethod
	public void refresh(ITestResult res) throws InterruptedException, IOException {
			
		if(res.FAILURE==res.getStatus()) {
			
			Utility1.Screenshot(driver, tcID);
			
		}
		
		
		Thread.sleep(2000);
			driver.navigate().refresh();
	}	
	
	
	@AfterClass
	public void closed() {
		
		
		driver.close();
		
		
	}
}
//""