package Framework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Configuration.ConfigurationPath;

public class A2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		A1 S = new A1(driver);
//		Test case 01
		S.Firstname(A3.M1(4, 0));
		
		S.Lastname(A3.M1(4, 1));
		
		
		S.button();
		Thread.sleep(1000);
		driver.navigate().back();
		
		driver.navigate().refresh();
//		Test case 02
		S.Firstname(A3.M1(5, 0));
		
		S.Lastname(A3.M1(5, 1));
		
		
		S.button();
		Thread.sleep(1000);
        driver.navigate().back();
		
		driver.navigate().refresh();
//		Test case 03
		S.Firstname(A3.M1(6, 0));
		
		S.Lastname(A3.M1(6, 1));
		
		
		S.button();
		
		driver.close();
	}
}
//""