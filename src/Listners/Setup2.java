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

public class Setup2 {

	WebDriver driver;

	Setup1 Sign;

	String tcid;

	@BeforeClass
	public void LaunchBrwser() throws IOException {

		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);

		ChromeOptions opt = new ChromeOptions();

		opt.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(opt);

		driver.get("https://en-gb.facebook.com/reg/");

		Sign = new Setup1(driver);

	}

	@BeforeMethod
	public void maximizeBrowser() throws IOException, InterruptedException {

		driver.manage().window().maximize();

	}

	@Test
	public void tc01() throws EncryptedDocumentException, IOException, InterruptedException {

		tcid = "TC001";
		Sign.firstname(Setup3.readexceldata(5, 0));

		Sign.lastname(Setup3.readexceldata(5, 1));

		Sign.mob(Setup3.readexceldata(5, 2));

		Sign.pass(Setup3.readexceldata(5, 3));

		Sign.Day(Setup3.readexceldata(5, 4));

		Sign.Month(Setup3.readexceldata(5, 5));

		Sign.Year(Setup3.readexceldata(5, 6));

		Sign.MBtn();

		Sign.Submit();

	}

	@Test
	public void tc02() throws EncryptedDocumentException, IOException, InterruptedException {

		tcid = "TC001";
		Sign.firstname(Setup3.readexceldata(6, 0));

		Sign.lastname(Setup3.readexceldata(6, 1));

		Sign.mob(Setup3.readexceldata(6, 2));

		Sign.pass(Setup3.readexceldata(6, 3));

		Sign.Day(Setup3.readexceldata(6, 4));

		Sign.Month(Setup3.readexceldata(6, 5));

		Sign.Year(Setup3.readexceldata(6, 6));

		Sign.MBtn();

		Sign.Submit();

	}

	@Test
	public void tc03() throws EncryptedDocumentException, IOException, InterruptedException {

		tcid = "TC001";
		Sign.firstname(Setup3.readexceldata(7, 0));

		Sign.lastname(Setup3.readexceldata(7, 1));

		Sign.mob(Setup3.readexceldata(7, 2));

		Sign.pass(Setup3.readexceldata(7, 3));

		Sign.Day(Setup3.readexceldata(7, 4));

		Sign.Month(Setup3.readexceldata(7, 5));

		Sign.Year(Setup3.readexceldata(7, 6));

		Sign.MBtn();

		Sign.Submit();

		Assert.fail();
	}

	@AfterMethod
	public void Refresh(ITestResult res) throws InterruptedException, IOException {

		if (res.SUCCESS == res.getStatus()) {

			Setup3.Screenshot(driver, tcid);
		}

		Thread.sleep(2000);
		driver.navigate().refresh();

	}

	@AfterClass
	public void Closed() {

		// driver.close();
	}
}
//""