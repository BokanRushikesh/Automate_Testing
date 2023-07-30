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

public class Demo2 {

	WebDriver driver;
	
	Demo1 D;
	
	String tcid ;
	@BeforeClass
	public void launchbrowser() {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(opt);
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		D = new Demo1(driver);
		
	}
	
	@BeforeMethod
	public void maximizebrowser() {
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void tc01() throws EncryptedDocumentException, IOException {
		
		tcid = "TC001";
		D.firstname(Demo3.readdata(9, 0));
		
		D.lastname(Demo3.readdata(9, 1));
		
		D.Address(Demo3.readdata(9, 2));
		
		D.Email(Demo3.readdata(9, 3));
		
		D.Phoneno(Demo3.readdata(9, 4));
		
		D.gender();
		
		D.Hobbie1();
		
		D.Hobbie2();
		
		D.language();
		
		D.language1();
		
		D.Skill(Demo3.readdata(9, 5));
		
		D.Year(Demo3.readdata(9, 6));
		
		D.Month(Demo3.readdata(9, 7));
		
		D.Day(Demo3.readdata(9, 8));
		
		D.Password(Demo3.readdata(9, 9));
		
		D.Confirmpass(Demo3.readdata(9, 10));
		
//		D.refresh();
	}
	
	@Test
	public void tc02() throws EncryptedDocumentException, IOException {
		
		tcid = "TC002";
		D.firstname(Demo3.readdata(8, 0));
		
		D.lastname(Demo3.readdata(8, 1));
		
		D.Address(Demo3.readdata(8, 2));
		
		D.Email(Demo3.readdata(8, 3));
		
		D.Phoneno(Demo3.readdata(8, 4));
		
		D.gender();
		
		D.Hobbie1();
		
		D.Hobbie2();
		
		D.language();
		
		D.language1();
		
		D.Skill(Demo3.readdata(8, 5));
		
		D.Year(Demo3.readdata(8, 6));
		
		D.Month(Demo3.readdata(8, 7));
		
		D.Day(Demo3.readdata(8, 8));
		
		D.Password(Demo3.readdata(8, 9));
		
		D.Confirmpass(Demo3.readdata(8, 10));
		
//		Assert.fail();
		
//		D.refresh();
	}
	
	@Test
	public void tc03() throws EncryptedDocumentException, IOException {
		
		tcid = "TC003";
		D.firstname(Demo3.readdata(10, 0));
		
		D.lastname(Demo3.readdata(10, 1));
		
		D.Address(Demo3.readdata(10, 2));
		
		D.Email(Demo3.readdata(10, 3));
		
		D.Phoneno(Demo3.readdata(10, 4));
		
		D.gender();
		
		D.Hobbie1();
		
		D.Hobbie2();
		
		D.language();
		
		D.language1();
		
		D.Skill(Demo3.readdata(10, 5));
		
		D.Year(Demo3.readdata(10, 6));
		
		D.Month(Demo3.readdata(10, 7));
		
		D.Day(Demo3.readdata(10, 8));
		
		D.Password(Demo3.readdata(10, 9));
		
		D.Confirmpass(Demo3.readdata(10, 10));
		
//		D.refresh();
	}
	@AfterMethod
	
	public void Refresh(ITestResult res) throws IOException, InterruptedException {
		
		if(res.FAILURE==res.getStatus()) 
		{
			Demo3.ScreenShot(driver, tcid);
		}
		
		Thread.sleep(3000);
		driver.navigate().refresh();
	}
	
	@AfterClass
	
	public void closedtab() {
		
//		driver.close();
	}
}
//""