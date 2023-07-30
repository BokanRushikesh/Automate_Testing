package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Configuration.ConfigurationPath;

public class Facebook_11 {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
		Facebook_1 A = new Facebook_1(driver);
		
//		Tc - 01
		A.Firstname("akshay");
		
		A.Lastname("ankit");
		
		A.Email("raksha");
		
		A.Pass("diksha");
		
//		Tc - 02
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		
        A.Firstname("ranveer");
		
		A.Lastname("alia");
		
		A.Email("dipika");
		
		A.Pass("kareena");
		
	}
	
}
// ""