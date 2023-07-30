package Framework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Configuration.ConfigurationPath;

public class Create2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
		Create1 D = new Create1(driver);
		
//		Test Case 01
		D.Firstname(Create3.M1(4, 0));
		
		D.Lastname(Create3.M1(4, 1));
		
		D.Email(Create3.M1(4, 2));
		
		D.mobile(Create3.M1(4, 3));
		
//		Test Case 02
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		D.Firstname(Create3.M1(5, 0));
		
		D.Lastname(Create3.M1(5, 1));
		
		D.Email(Create3.M1(5, 2));
		
		D.mobile(Create3.M1(5, 3));
		
//		Test Case 03
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		D.Firstname(Create3.M1(6, 0));
		
		D.Lastname(Create3.M1(6, 1));
		
		D.Email(Create3.M1(6, 2));
		
		D.mobile(Create3.M1(6, 3));
		
//		Test Case 04
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		D.Firstname(Create3.M1(7, 0));
		
		D.Lastname(Create3.M1(7, 1));
		
		D.Email(Create3.M1(7, 2));
		
		D.mobile(Create3.M1(7, 3));
		
//		Test Case 05
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		D.Firstname(Create3.M1(8, 0));
		
		D.Lastname(Create3.M1(8, 1));
		
		D.Email(Create3.M1(8, 2));
		
		D.mobile(Create3.M1(8, 3));
	}
}
//""