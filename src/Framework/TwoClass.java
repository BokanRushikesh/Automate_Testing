package Framework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Configuration.ConfigurationPath;

public class TwoClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		ChromeOptions opt  = new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
		Oneclass c = new Oneclass(driver);
		
		// Test 1
		c.firstname(Threeclass.readdata(5, 0));
		
		c.lastname(Threeclass.readdata(5, 1));
		
		c.Email(Threeclass.readdata(5, 2));
		
		c.Pass(Threeclass.readdata(5, 3));
		
		c.Day(Threeclass.readdata(5, 4));
		
		c.Month(Threeclass.readdata(5, 5));
		
		c.Year(Threeclass.readdata(5, 6));
		
		c.Male();
		
		c.Btn();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		// Test 2
		
         c.firstname(Threeclass.readdata(6, 0));
		
		c.lastname(Threeclass.readdata(6, 1));
		
		c.Email(Threeclass.readdata(6, 2));
		
		c.Pass(Threeclass.readdata(6, 3));
		
		c.Day(Threeclass.readdata(6, 4));
		
		c.Month(Threeclass.readdata(6, 5));
		
		c.Year(Threeclass.readdata(6, 6));
		
		c.Male();
		
		c.Btn();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		// Test 3
        c.firstname(Threeclass.readdata(7, 0));
		
		c.lastname(Threeclass.readdata(7, 1));
		
		c.Email(Threeclass.readdata(7, 2));
		
		c.Pass(Threeclass.readdata(7, 3));
		
		c.Day(Threeclass.readdata(7, 4));
		
		c.Month(Threeclass.readdata(7, 5));
		
		c.Year(Threeclass.readdata(7, 6));
		
		c.Male();
		
		c.Btn();
		
		
		
	}
}
