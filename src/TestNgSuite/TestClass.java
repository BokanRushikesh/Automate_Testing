package TestNgSuite;

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

public class TestClass {

	WebDriver driver;
	SignUpPOM signup;

	
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");				
		signup =  new SignUpPOM(driver);		

	}
	
	@BeforeMethod
	public void maxmizeBrowser() {
		driver.manage().window().maximize(); // Maximize browser
		
	}
	
	@Test
	public void tc01() throws EncryptedDocumentException, IOException {
		signup.enterFirstName(Utility.readExcelData(1, 0));
		signup.enterLastName(Utility.readExcelData(1, 1));
		signup.enterMobNum(Utility.readExcelData(1, 2));
		signup.enterPassword(Utility.readExcelData(1, 3));		
	}
	
	@Test
	public void tc02() throws EncryptedDocumentException, IOException {
		signup.enterFirstName(Utility.readExcelData(2, 0));
		signup.enterLastName(Utility.readExcelData(2, 1));
		signup.enterMobNum(Utility.readExcelData(2, 2));
		signup.enterPassword(Utility.readExcelData(2, 3));
	}
	
	@Test
	public void tc03() throws EncryptedDocumentException, IOException {
		signup.enterFirstName(Utility.readExcelData(3, 0));
		signup.enterLastName(Utility.readExcelData(3, 1));
		signup.enterMobNum(Utility.readExcelData(3, 2));
		signup.enterPassword(Utility.readExcelData(3, 3));
	}
	
	@AfterMethod()
	public void refresh() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.navigate().refresh();
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}
