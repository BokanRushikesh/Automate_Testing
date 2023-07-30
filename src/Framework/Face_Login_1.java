package Framework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Configuration.ConfigurationPath;

public class Face_Login_1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		
		Face_Login A = new Face_Login(driver);
		
		A.m1(utility1.readdata(1, 0));
		
		A.m2(utility1.readdata(1, 1));
		utility1.picture(driver);
		A.m3();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.navigate().refresh();
		
        A.m1(utility1.readdata(2, 0));
		
		A.m2(utility1.readdata(2, 1));
		utility1.picture(driver);
		A.m3();
		
	}
}
//""