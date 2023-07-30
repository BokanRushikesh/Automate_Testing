package Testing1;

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
import TestNgSuite.Utility;

public class TestClass {
	
	WebDriver driver;
	
	PomClass Signup;
	

	@BeforeClass
	public void Browseropen() {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		 driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		Signup = new PomClass(driver);
	}
	
	@BeforeMethod
	public void maximize() {
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void tc01() throws EncryptedDocumentException, IOException {
		
		Signup.firstname(Utility.readExcelData(4, 0));
		
		Signup.lasstname(Utility.readExcelData(4, 1));
		
		Signup.MobileNumber(Utility.readExcelData(4, 2));
		
		Signup.Password(Utility.readExcelData(4, 3));
	}
	
	@Test
	public void tc02() throws EncryptedDocumentException, IOException {
		
		Signup.firstname(Utility.readExcelData(5, 0));
		
		Signup.lasstname(Utility.readExcelData(5, 1));
		
		Signup.MobileNumber(Utility.readExcelData(5, 2));
		
		Signup.Password(Utility.readExcelData(5, 3));
	}
	
	@Test
	public void tc03() throws EncryptedDocumentException, IOException {
		
		Signup.firstname(Utility.readExcelData(6, 0));
		
		Signup.lasstname(Utility.readExcelData(6, 1));
		
		Signup.MobileNumber(Utility.readExcelData(6, 2));
		
		Signup.Password(Utility.readExcelData(6, 3));
	}
	
	@Test
	public void tc04() throws EncryptedDocumentException, IOException {
		
		Signup.firstname(Utility.readExcelData(7, 0));
		
		Signup.lasstname(Utility.readExcelData(7, 1));
		
		Signup.MobileNumber(Utility.readExcelData(7, 2));
		
		Signup.Password(Utility.readExcelData(7, 3));
	}
	
	@Test
	public void tc05() throws EncryptedDocumentException, IOException {
		
		Signup.firstname(Utility.readExcelData(8, 0));
		
		Signup.lasstname(Utility.readExcelData(8, 1));
		
		Signup.MobileNumber(Utility.readExcelData(8, 2));
		
		Signup.Password(Utility.readExcelData(8, 3));
	}
	@AfterMethod
	public void Refresh() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
	
	@AfterClass
	public void Closed() {
		
		driver.close();
		
	}

}
//""