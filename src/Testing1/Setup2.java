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

public class Setup2 {
	
	WebDriver driver;
	
	Setup1 Sign ;

	@BeforeClass
	public void LaunchBrwser() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		 driver = new ChromeDriver();
		 
		 driver.get("https://en-gb.facebook.com/reg/");
		 
		 
		 Sign = new Setup1(driver);
		 
		 
		
	}
	
	@BeforeMethod
	public void maximizeBrowser() throws IOException, InterruptedException {
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		Setup3.Screenshot(driver);
	}
	
	@Test
	public void FirstName() throws EncryptedDocumentException, IOException, InterruptedException {
		
		Sign.firstname(Setup3.readexceldata(4, 0));
		Thread.sleep(1000);
		Setup3.Screenshot(driver);
		
		Sign.lastname(Setup3.readexceldata(4, 1));
		Thread.sleep(1000);
		Setup3.Screenshot(driver);
		
		Sign.mob(Setup3.readexceldata(4, 2));
		Thread.sleep(1000);
		Setup3.Screenshot(driver);
		
		Sign.pass(Setup3.readexceldata(4, 3));
		Thread.sleep(1000);
		Setup3.Screenshot(driver);
		
		Sign.Day(Setup3.readexceldata(4, 4));
		Thread.sleep(1000);
		Setup3.Screenshot(driver);
		
		Sign.Month(Setup3.readexceldata(4, 5));
		Thread.sleep(1000);
		Setup3.Screenshot(driver);
		
		Sign.Year(Setup3.readexceldata(4, 6));
		Thread.sleep(1000);
		Setup3.Screenshot(driver);
		
		Sign.MBtn();
		Thread.sleep(1000);
		Setup3.Screenshot(driver);
		
		Sign.Submit();
		Thread.sleep(1000);
		Setup3.Screenshot(driver);
	}
	
	@AfterMethod
	public void Refresh() throws InterruptedException {
		
		Thread.sleep(5000);
//		driver.navigate().refresh();
		
		
		
	}
	
	@AfterClass
	public void Closed() {
		
		//driver.close();
	}
}
//""