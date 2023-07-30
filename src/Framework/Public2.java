package Framework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Configuration.ConfigurationPath;

public class Public2 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver   = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Public1 S = new Public1(driver);
		
//		Test Case 01
		S.Firstname(Pubic3.readdata(4, 0));
		
		S.Lastname(Pubic3.readdata(4, 1));
		
		S.Button();
		Pubic3.picture(driver);
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		
//		Test Case 02
		S.Firstname(Pubic3.readdata(5, 0));
		
		S.Lastname(Pubic3.readdata(5, 1));
		
		S.Button();
		Pubic3.picture(driver);
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		
//		Test Case 03
		S.Firstname(Pubic3.readdata(6, 0));
		
		S.Lastname(Pubic3.readdata(6, 1));
		
		S.Button();
		Pubic3.picture(driver);
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		
//		Test Case 04
		S.Firstname(Pubic3.readdata(7, 0));
		
		S.Lastname(Pubic3.readdata(7, 1));
		
		S.Button();
		Pubic3.picture(driver);
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
//		Test Case 05
		S.Firstname(Pubic3.readdata(8, 0));
		
		S.Lastname(Pubic3.readdata(8, 1));
		
		S.Button();
		Pubic3.picture(driver);
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		driver.navigate().refresh();
	}
}
//""