package Framework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Configuration.ConfigurationPath;

public class Demo {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.firefoxdriver", ConfigurationPath.Firefox);
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
		Test1 T = new Test1(driver);
		
//		Test Case 01
		
		T.Firstname(Utility.readexceldata(10, 0));
		
		T.Lastname(Utility.readexceldata(10, 1));
		
		T.Email(Utility.readexceldata(10, 2));
		
		T.Password(Utility.readexceldata(10, 3));
		
		T.BDay(Utility.readexceldata(10, 4));
		
		T.BMonth(Utility.readexceldata(10, 5));
		
		T.BYear(Utility.readexceldata(10, 6));
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
//		Test Case 02
		
		T.Firstname(Utility.readexceldata(10, 0));
		
		T.Lastname(Utility.readexceldata(10, 1));
		
		T.Email(Utility.readexceldata(10, 2));
		
		T.Password(Utility.readexceldata(10, 3));
		
		T.BDay(Utility.readexceldata(10, 4));
		
		T.BMonth(Utility.readexceldata(10, 5));
		
		T.BYear(Utility.readexceldata(10, 6));
		

		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
//		Test Case 03
		
		T.Firstname(Utility.readexceldata(10, 0));
		
		T.Lastname(Utility.readexceldata(10, 1));
		
		T.Email(Utility.readexceldata(10, 2));
		
		T.Password(Utility.readexceldata(10, 3));
		
		T.BDay(Utility.readexceldata(10, 4));
		
		T.BMonth(Utility.readexceldata(10, 5));
		
		T.BYear(Utility.readexceldata(10, 6));
		
	}   
	

}
//""